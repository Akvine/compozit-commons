package ru.akvine.compozit.commons.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import ru.akvine.compozit.commons.exceptions.AssertsException;

import java.util.Objects;

@UtilityClass
public class Asserts {
    public void isNotNull(Object object, String message) {
        if (Objects.isNull(object)) {
            throw new AssertsException(message);
        }
    }

    public void isNotNull(Object object) {
        String message = object.getClass().getSimpleName() + " is null!";
        isNotNull(object, message);
    }

    public void isNotBlank(String content, String message) {
        if (StringUtils.isBlank(content)) {
            throw new AssertsException(message);
        }
    }
}
