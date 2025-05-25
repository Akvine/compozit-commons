package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.dto.SuccessfulResponse;

@Data
@Accessors(chain = true)
public class GenerateClearScriptResponse extends SuccessfulResponse {
    private String result;
}
