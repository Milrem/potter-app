package com.mycompany.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class House {
    private String house;
    private String emoji;
    private String founder;
    private String animal;
}
