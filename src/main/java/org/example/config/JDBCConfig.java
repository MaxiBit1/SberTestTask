package org.example.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class JDBCConfig {

    private DataSource getDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:h2:mem:SberTestTask;MODE=PostgreSQL");
        config.setPassword("root");
        config.setUsername("root");
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }

}
