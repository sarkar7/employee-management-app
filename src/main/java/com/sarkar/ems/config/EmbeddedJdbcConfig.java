package com.sarkar.ems.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "h2EntityManagerFactoryBean",
        basePackages = {"com.sarkar.ems.repositories.postgres"},
        transactionManagerRef = "postgresTransactionManager"
)
@ConditionalOnProperty(prefix = "enable.h2.database", name = "h2-db-switch", havingValue = "true")
public class EmbeddedJdbcConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmbeddedJdbcConfig.class);

    @Bean(name="h2DataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("sa");
        dataSource.setPassword("password");
        return dataSource;
    }

    //entity manager factory
    @Bean(name="h2EntityManagerFactoryBean")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.ddl-auto", "update");

        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(adapter);
        entityManagerFactoryBean.setJpaPropertyMap(props);
        entityManagerFactoryBean.setPackagesToScan("com.sarkar.ems.models.postgres");
        return entityManagerFactoryBean;
    }


    //platform transaction manager
    @Bean("h2TransactionManager")
    @Primary
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
        return transactionManager;
    }

}
