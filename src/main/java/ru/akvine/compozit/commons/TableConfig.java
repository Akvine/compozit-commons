package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TableConfig {
    private List<ColumnInfo> columnConfigs;
    private int size;
}
