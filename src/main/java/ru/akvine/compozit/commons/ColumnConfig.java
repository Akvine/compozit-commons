package ru.akvine.compozit.commons;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ColumnConfig {
    @NotBlank
    private String name;

    @NotBlank
    private String type;

    private boolean unique;

    private boolean notNull;

    @NotBlank
    private String rangeType;

    @NotBlank
    private String start;

    @NotBlank
    private String end;

    private String step;

    private Integer length;

    private ColumnMetaInfoDto metaInfo;
}
