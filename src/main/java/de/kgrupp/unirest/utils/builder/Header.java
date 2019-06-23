package de.kgrupp.unirest.utils.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Header {
    private String key;
    private String value;
    private boolean showValueInLog;
}
