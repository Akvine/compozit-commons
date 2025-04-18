package ru.akvine.compozit.commons.istochnik;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FilterDto {
    private String name;

    private Object[] arguments = new Object[]{};
}
