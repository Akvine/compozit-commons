package ru.akvine.compozit.commons.istochnik;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

@Data
@Accessors(chain = true)
public class ErrorResolveInfo {
    @NotNull
    private ErrorResolvePolicy policy = ErrorResolvePolicy.INTERRUPT;
    private String defaultValue = StringUtils.EMPTY;
}
