package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RowDto {
    private String tableName;
    private boolean[] values;
}
