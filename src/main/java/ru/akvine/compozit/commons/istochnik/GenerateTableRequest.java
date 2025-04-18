package ru.akvine.compozit.commons.istochnik;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class GenerateTableRequest {
    private List<ColumnDto> columns;
    private int size;
    private String fileType;
}