package com.mycompany.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {
    private String fullName;
    private String nickname;
    private String hogwartsHouse;
    private String interpretedBy;
    private String birthdate;
}
