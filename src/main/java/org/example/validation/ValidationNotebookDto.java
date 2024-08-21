package org.example.validation;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.NotebookDto;
import org.example.exception.ValidationException;

@Slf4j
public class ValidationNotebookDto {

    public static void validationDto(NotebookDto notebookDto) {
        if (notebookDto.getModelName().isEmpty() || notebookDto.getModelName().isBlank()) {
            log.error("ValidationNotebookDto class: Название модели пустое/его нет");
            throw new ValidationException("Название модели пустое/его нет");
        }
        if (notebookDto.getCompanyName().isEmpty() || notebookDto.getCompanyName().isBlank()) {
            log.error("ValidationNotebookDto class: Название компании пустое/его нет");
            throw new ValidationException("Название пустое пустое/его нет");
        }
        if (notebookDto.getSizeRam() <= 0 || notebookDto.getSizeRam() % 2 != 0) {
            log.error("ValidationNotebookDto class: Неправильный размер RAM");
            throw new ValidationException("Неправильный размер RAM");
        }
        if (notebookDto.getSizePZU() <= 0 || notebookDto.getSizePZU() % 2 != 0) {
            log.error("ValidationNotebookDto class: Неправильный размер PZU");
            throw new ValidationException("Неправильный размер PZU");
        }
        if (notebookDto.getResolution().isEmpty() || notebookDto.getResolution().isBlank()) {
            log.error("ValidationNotebookDto class: Разрешение пустое/его нет");
            throw new ValidationException("Разрешение пустое/его нет");
        }
        if (notebookDto.getPrice() < 0.0) {
            log.error("ValidationNotebookDto class: Цена меньше нуля");
            throw new ValidationException("Цена меньше нуля");
        }
    }
}
