package ru.akvine.compozit.commons.scripts;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.ConnectionRequest;

import java.util.Collection;
import java.util.HashSet;

@Data
@Accessors(chain = true)
public class ExecuteScriptsRequest {
    @NotNull
    private Collection<String> scripts = new HashSet<>();

    @NotNull
    private ConnectionRequest connection;
}
