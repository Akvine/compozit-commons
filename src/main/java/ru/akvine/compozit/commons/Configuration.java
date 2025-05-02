package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class Configuration {
    private Map<String, TableConfig> tablesConfigs;
}
