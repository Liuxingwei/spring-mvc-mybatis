package cn.liuxingwei.spring.mvc.maven.web;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/jdbcexp")
public class JdbcExperimentController {
    @RequestMapping(value = "/createtable", method = GET)
    public String createTable() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_maven");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource);

        String sql = "create table t_user(user_id int primary key, user_name varchar(60))";
        jdbcTemplate.execute(sql);
        return "OK";
    }
}
