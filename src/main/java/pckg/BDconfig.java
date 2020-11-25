package pckg;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public class BDconfig {

    static public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }


    static public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/TEST_BD");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("4321rewq");
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        return driverManagerDataSource;
    }
}