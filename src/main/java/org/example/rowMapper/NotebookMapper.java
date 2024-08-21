package org.example.rowMapper;


import org.example.dto.NotebookDto;
import org.example.model.NotebookModel;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Класс маппинга ноутбуков
 */
public class NotebookMapper {

    /**
     * Метод маппинга модели NotebookModel
     *
     * @param rs - интерфейс для получение результирующих данных
     * @return - модель NotebookModel
     * @throws SQLException - проверяемое исключение
     */
    public static NotebookModel makeNotebook(ResultSet rs) throws SQLException {
        return new NotebookModel(rs.getLong("id"),
                rs.getNString("model_name"),
                rs.getNString("company_name"),
                rs.getInt("size_ram"),
                rs.getInt("size_pzu"),
                rs.getString("resolution"),
                rs.getDouble("price"));
    }

    /**
     * Метод маппинга модели NotebookDto
     *
     * @param rs - интерфейс для получение результирующих данных
     * @return - модель NotebookDto
     * @throws SQLException - проверяемое исключение
     */
    public static NotebookDto makeNotebookDto(ResultSet rs) throws SQLException {
        return new NotebookDto(rs.getString("model_name"),
                rs.getString("company_name"),
                rs.getInt("size_ram"),
                rs.getInt("size_pzu"),
                rs.getString("resolution"),
                rs.getDouble("price"));
    }
}
