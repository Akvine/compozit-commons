package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TableConfig {
    private String tableName;
    private List<ColumnConfig> columnConfigs;
    private int size;
}
