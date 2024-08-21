package org.example;

import org.example.dao.DefaultNotebookDao;
import org.example.dao.NotebookDao;
import org.example.dto.NotebookDto;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        NotebookDao notebookDao = new DefaultNotebookDao();
//        notebookDao.createTableNotebook();
//        notebookDao.addNotebook(new NotebookDto("Acer424", "ACER", 6, 1000, "1920x1080", 90000.00));
        notebookDao.selectAllNotebooks().forEach(System.out::println);
        System.out.println(notebookDao.selectNotebooksWithParameters("model_name", "=", "'Acer424'"));
//        notebookDao.dropTable();
//        notebookDao.addNotebook(new NotebookDto("Acer11", "ACER", 8, 1, "1920x1080", 90000.00));
//        notebookDao.selectAllNotebooks().forEach(elem -> elem.toString());
    }
}