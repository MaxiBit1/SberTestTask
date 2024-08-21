package org.example.service;

import org.example.dto.NotebookDto;

import java.sql.SQLException;
import java.util.List;

/**
 * Интерфейс сервиса notebook
 */
public interface NotebookService {
    /**
     * Метод создания таблицы notebooks
     *
     * @throws SQLException - проверяемое исключение
     */
    void createTableNotebook() throws SQLException;

    /**
     * Метод выборки всех данных из таблицы notebooks
     *
     * @return - список всех ноутбуков
     * @throws SQLException - проверяемое исключение
     */
    List<NotebookDto> selectAllNotebooks() throws SQLException;

    /**
     * Метод выборки данных по определенным условиям
     *
     * @param parameters - аттрибут
     * @param operator   - оператор для условия
     * @param value      - значение аттрибута
     * @return - список всех ноутбуков
     * @throws SQLException - проверяемое исключение
     */
    List<NotebookDto> selectNotebooksWithParameters(String parameters, String operator, String value) throws SQLException;

    /**
     * Метод добавления нового ноутбука в таблицу notebooks
     *
     * @param notebookDto - объект DTO ноутбука
     * @throws SQLException - проверяемое исключение
     */
    void addNotebook(NotebookDto notebookDto) throws SQLException;

    /**
     * Удаление ноутбука из таблицы notebooks по опрделенному условию
     *
     * @param parameters - аттрибут
     * @param operator   - оператор для условия
     * @param value      - значение аттрибута
     * @throws SQLException - проверяемое исключение
     */
    void deleteNotebook(String parameters, String operator, String value) throws SQLException;

    /**
     * Метод удаления таблицы notebooks
     *
     * @throws SQLException - проверяемое исключение
     */
    void dropTable() throws SQLException;
}
