package ru.akvine.compozit.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
@AllArgsConstructor
public enum DeleteMode {
    TRUNCATE("truncate"),
    DELETE("delete");

    private final String name;

    public static DeleteMode from(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name can't be blank!");
        }

        for (DeleteMode value : values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Delete mode with name = [" + name + "] is not supported by app!");
    }
}
