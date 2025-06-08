package ru.akvine.compozit.commons;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetRelatedTablesRequest {

    @NotBlank
    private String tableName;

    @NotNull
    private ConnectionRequest connection;
}
