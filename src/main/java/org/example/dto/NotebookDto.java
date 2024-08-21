package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс модель выдаваемых ноутбуков
 */
@Data
@AllArgsConstructor
public class NotebookDto {
    private String modelName;
    private String companyName;
    private int sizeRam;
    private int sizePZU;
    private String resolution;
    private Double price;
}
