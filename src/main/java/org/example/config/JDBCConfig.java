package org.example.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCConfig {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        connection = getDataSource().getConnection();
        return connection;
    }

    public static void closeConnection() throws SQLException{
        connection.close();
    }

    private static DataSource getDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/SberTestTask");
        config.addDataSourceProperty("databaseName","SberTestTask");
        config.setPassword("postgres");
        config.setUsername("postgres");
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }

}
