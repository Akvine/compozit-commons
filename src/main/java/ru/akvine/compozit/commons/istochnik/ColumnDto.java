package ru.akvine.compozit.commons.istochnik;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ColumnDto {
    @NotBlank
    private String name;

    @NotBlank
    private String type;

    @NotBlank
    private String generationStrategy;

    private ConfigDto config;

    private boolean convertToString;

    private List<ConverterDto> postConverters;

    private List<ConverterDto> converters;

    @NotNull
    private ErrorResolveInfo errorResolveInfo = new ErrorResolveInfo();
}
