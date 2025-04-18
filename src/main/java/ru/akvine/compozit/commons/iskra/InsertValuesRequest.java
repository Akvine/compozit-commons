package ru.akvine.compozit.commons.iskra;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.ColumnMetaInfoDto;
import ru.akvine.compozit.commons.ConnectionDto;

import java.util.Map;

@Data
@Accessors(chain = true)
public class InsertValuesRequest {
    @NotBlank
    private String tableName;

    @NotNull
    private ConnectionDto connection;

    @NotNull
    private byte[] content;

    @NotNull
    private Map<String, ColumnMetaInfoDto> columnsMetaInfo;
}
