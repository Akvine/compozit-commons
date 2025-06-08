package ru.akvine.compozit.commons.istochnik;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CustomBaseTypeDto extends BaseTypeDto {
    private String customType;
}
