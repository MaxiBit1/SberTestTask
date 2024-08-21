package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotebookModel {
    private long id;
    private String modelName;
    private String companyName;
    private int sizeRam;
    private int sizePZU;
    private String resolution;
    private Double price;
}
