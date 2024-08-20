package com.mycompany.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private long number;
    private String title;
    private String originalTitle;
    private String releaseDate;
    private String description;
    private int pages;
    private String cover;

}
