package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Deprecated
public class ConnectionDto {
    private String connectionName;

    private String databaseName;

    private String databaseType;

    private String host;

    private String port;

    private String schema;

    private String username;

    private String password;
}
