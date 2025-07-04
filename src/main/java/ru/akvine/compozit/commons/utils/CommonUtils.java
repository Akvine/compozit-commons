package ru.akvine.compozit.commons.utils;

import lombok.experimental.UtilityClass;

import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@UtilityClass
public class CommonUtils {
    public <T> Optional<T> safeCast(Object object, Class<T> clazz) {
        return clazz.isInstance(object) ? Optional.of(clazz.cast(object)) : Optional.empty();
    }

    @SuppressWarnings("unchecked")
    public <T extends Serializable> T deepCopy(T object,
                                               RuntimeException exceptionToThrowIfFailed) {
        try (
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos)
        ) {
            oos.writeObject(object);
            try (
                    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                    ObjectInputStream ois = new ObjectInputStream(bais)
            ) {
                return (T) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException exception) {
            throw exceptionToThrowIfFailed;
        }
    }

    public List<Path> findFiles(Path root, Predicate<Path> filter) throws IOException {
        try (Stream<Path> stream = Files.walk(root)) {
            return stream.filter(Files::isRegularFile).filter(filter).toList();
        }
    }

    public <T> T retry(int attempts, Duration delay,
                       Supplier<T> task,
                       RuntimeException exceptionToThrowIfFailed) {
        for (int i = 1; i <= attempts; i++) {
            try {
                return task.get();
            } catch (Exception exception) {
                if (i == attempts) {
                    throw exception;
                }

                try {
                    Thread.sleep(delay);
                } catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        throw  exceptionToThrowIfFailed;
    }

    public String toQueryString(Map<String, String> params) {
        return params.entrySet().stream()
                .map(e -> URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8) + "=" +
                        URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));
    }

    public <E extends Enum<E>> Map<String, E> enumMap(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants())
                .collect(Collectors.toMap(Enum::name, Function.identity()));
    }
}
