package org.example.dao;

import org.example.dto.NotebookDto;
import org.example.model.NotebookModel;

import java.sql.SQLException;
import java.util.List;

public interface NotebookDao {
    void createTableNotebook() throws SQLException;
    List<NotebookDto> selectAllNotebooks() throws SQLException;
    List<NotebookDto> selectNotebooksWithParameters(String parameters, String operator, String value) throws SQLException;
    void addNotebook(NotebookDto notebookDto) throws SQLException;
    void deleteNotebook(String parameters, String operator, String value) throws SQLException;
    void dropTable() throws SQLException;
}
