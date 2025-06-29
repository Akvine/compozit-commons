package ru.akvine.compozit.commons.visor;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.dto.SuccessfulResponse;

import java.util.Map;

@Data
@Accessors(chain = true)
public class GenerateScriptsResponse extends SuccessfulResponse {
    private Map<String, ScriptResultDto> tableNameWithScripts;
}
