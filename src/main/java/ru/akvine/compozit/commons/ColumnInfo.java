package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.istochnik.ColumnDto;

@Data
@Accessors(chain = true)
public class ColumnInfo {
    private ColumnDto column;
    private ColumnMetaInfoDto columnMetaInfo;
}
