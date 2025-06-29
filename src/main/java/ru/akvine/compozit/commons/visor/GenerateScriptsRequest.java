package ru.akvine.compozit.commons.visor;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.ConnectionRequest;

import java.util.Collection;
import java.util.List;

@Data
@Accessors(chain = true)
public class GenerateScriptsRequest {

    @NotNull
    private Collection<String> tableNames;

    @NotNull
    private List<String> constraints;

    @NotNull
    private ConnectionRequest connection;
}
