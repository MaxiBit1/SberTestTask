package org.example.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Класс конфигуратор для подключения к БД
 */
public class JDBCConfig {

    private static Connection connection;

    /**
     * Метод инициализирования интерфейса Connection
     *
     * @return - Connection инициализированный
     * @throws SQLException - проверяемое исключение
     */
    public static Connection getConnection() throws SQLException {
        connection = getDataSource().getConnection();
        return connection;
    }

    /**
     * Метод закрытие ресурса подключения к БД
     *
     * @throws SQLException - проверяемое исключение
     */
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    /**
     * Метод создания подключение пула
     *
     * @return - подключение
     */
    private static DataSource getDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/SberTestTask");
        config.addDataSourceProperty("databaseName", "SberTestTask");
        config.setPassword("postgres");
        config.setUsername("postgres");
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }

}
