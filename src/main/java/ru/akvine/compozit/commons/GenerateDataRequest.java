package ru.akvine.compozit.commons;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GenerateDataRequest {
    @NotNull
    private Configuration configuration;

    @NotNull
    private RelationsMatrixDto relationsMatrix;

    @NotNull
    private ConnectionDto connection;
}
