package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Configuration {
    private List<TableConfig> tablesConfigs;
}
