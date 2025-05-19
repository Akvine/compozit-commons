package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.dto.SuccessfulResponse;

import java.util.List;

@Data
@Accessors(chain = true)
public class GetRelatedTablesResponse extends SuccessfulResponse {
    private String ownerTableName;
    private List<String> relatedTablesNames;
}
