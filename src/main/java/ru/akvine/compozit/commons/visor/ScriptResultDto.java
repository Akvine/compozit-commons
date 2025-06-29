package ru.akvine.compozit.commons.visor;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class ScriptResultDto {
    private List<String> dropScripts = new ArrayList<>();
    private List<String> createScripts = new ArrayList<>();
}
