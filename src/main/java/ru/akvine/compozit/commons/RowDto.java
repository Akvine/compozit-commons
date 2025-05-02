package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RowDto {
    private String tableName;
    private List<CellDto> cells;

    public boolean hasRelations() {
        return cells.stream().anyMatch(CellDto::isHasRelation);
    }
}
