package ru.akvine.compozit.commons.istochnik;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Set;

@Data
@Accessors(chain = true)
public class ConfigDto {
    private boolean unique;

    private boolean notNull;

    private boolean valid;

    private String rangeType;

    private String start;

    private String end;

    private String step;

    private Integer length;

    private Object constant;

    private Set<Set<String>> dictionaries;

    private Set<String> regexps;

    private List<String> topics = List.of();

    private String language;
}
