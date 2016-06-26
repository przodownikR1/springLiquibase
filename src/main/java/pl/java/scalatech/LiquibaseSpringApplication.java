package pl.java.scalatech;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import liquibase.integration.spring.SpringLiquibase;

@SpringBootApplication
public class LiquibaseSpringApplication {
    @Autowired
    private DataSource dataSource; 
    
    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:/db/changelogs.xml");
        liquibase.setDataSource(dataSource);
        
        return liquibase;
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(LiquibaseSpringApplication.class, args);
    }
}
