package ru.akvine.compozit.commons.istochnik;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.akvine.compozit.commons.dto.SuccessfulResponse;

import java.util.List;

@Data
@Accessors(chain = true)
public class CustomTypesListResponse extends SuccessfulResponse {
    private List<CustomBaseTypeDto> types;
}
