package ru.akvine.compozit.commons;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PageInfo {
    private final int page;
    private final int count;
}
