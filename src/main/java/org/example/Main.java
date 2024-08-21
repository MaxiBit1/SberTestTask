package org.example;

import org.example.dao.DefaultNotebookDao;
import org.example.dao.NotebookDao;
import org.example.service.DefaultNotebookService;
import org.example.service.NotebookService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        NotebookDao notebookDao = new DefaultNotebookDao();
        NotebookService notebookService = new DefaultNotebookService(notebookDao);
//        notebookDao.createTableNotebook();
//        notebookDao.addNotebook(new NotebookDto("Acer424", "ACER", 6, 1000, "1920x1080", 90000.00));
//        notebookService.selectAllNotebooks().forEach(System.out::println);
//        System.out.println(notebookService.selectNotebooksWithParameters("modelName", "=", "Acer424"));
//        notebookDao.dropTable();
//        notebookDao.addNotebook(new NotebookDto("Acer11", "ACER", 8, 1, "1920x1080", 90000.00));
//        notebookDao.selectAllNotebooks().forEach(elem -> elem.toString());
    }
}