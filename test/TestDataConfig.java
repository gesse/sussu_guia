import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import configs.DataConfig;

@Configuration
@EnableTransactionManagement
public class TestDataConfig extends DataConfig {
    
    @Bean
    @Override
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost/guia"); // todo: why doesn't in-memory work here?
        dataSource.setPassword("postgres");
        dataSource.setUsername("postgres");
        return dataSource;
    }
    
}
