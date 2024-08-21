package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.dao.NotebookDao;
import org.example.dto.NotebookDto;
import org.example.exception.ParametersException;

import java.sql.SQLException;
import java.util.List;

/**
 * Класс-реализатор интерфеса NotebookService
 */
@Slf4j
public class DefaultNotebookService implements NotebookService {

    private final NotebookDao notebookDao;

    public DefaultNotebookService(NotebookDao notebookDao) {
        this.notebookDao = notebookDao;
    }


    @Override
    public void createTableNotebook() throws SQLException {
        log.info("DefaultNotebookService class: create table notebooks");
        notebookDao.createTableNotebook();
    }

    @Override
    public List<NotebookDto> selectAllNotebooks() throws SQLException {
        log.info("DefaultNotebookService class: Get all notebooks");
        return notebookDao.selectAllNotebooks();
    }

    @Override
    public List<NotebookDto> selectNotebooksWithParameters(String parameters, String operator, String value) throws SQLException {
        parameters = changeNameParameters(parameters);
        value = addValueQuotes(parameters, value);
        log.info("DefaultNotebookService class: Get notebooks with parameters {}, operator {}, value {}", parameters, operator, value);
        return notebookDao.selectNotebooksWithParameters(parameters, operator, value);
    }

    @Override
    public void addNotebook(NotebookDto notebookDto) throws SQLException {
        log.info("DefaultNotebookService class: Insert notebook with data: modelName - {}, company_name - {}, sizeRam - {}, sizePZU - {}, resolution - {}, price - {}",
                notebookDto.getModelName(), notebookDto.getCompanyName(), notebookDto.getSizeRam(), notebookDto.getSizePZU(), notebookDto.getResolution(), notebookDto.getPrice());
        notebookDao.addNotebook(notebookDto);
    }

    @Override
    public void deleteNotebook(String parameters, String operator, String value) throws SQLException {
        parameters = changeNameParameters(parameters);
        value = addValueQuotes(parameters, value);
        log.info("DefaultNotebookService class: Delete data from table with parameters {} {} {}", parameters, operator, value);
        notebookDao.deleteNotebook(parameters, operator, value);
    }

    @Override
    public void dropTable() throws SQLException {
        log.info("DefaultNotebookService class: Drop table notebooks");
        notebookDao.dropTable();
    }

    /**
     * Метод замены на название аттрибута из таблицы
     *
     * @param parameters - аттрибут
     * @return - измененный аттрибут
     */
    private String changeNameParameters(String parameters) {
        switch (parameters) {
            case "modelName" -> {
                return "model_name";
            }
            case "companyName" -> {
                return "company_name";
            }
            case "sizeRam" -> {
                return "size_ram";
            }
            case "sizePzu" -> {
                return "size_pzu";
            }
            case "resolution", "price" -> {
                return parameters;
            }
            default -> {
                log.error("DefaultNotebookService class: Не правильный параметер");
                throw new ParametersException("Не правильный параметер");
            }
        }
    }

    /**
     * Метод добавление ковычек к значению строковых аттрибутов
     *
     * @param parameters - аттрибут
     * @param value      - значение
     * @return - изменненый или не изменненный аттрибут
     */
    private String addValueQuotes(String parameters, String value) {
        if (parameters.equals("model_name")
                || parameters.equals("company_name")
                || parameters.equals("resolution")) {
            return "'" + value + "'";
        }
        return value;
    }
}
