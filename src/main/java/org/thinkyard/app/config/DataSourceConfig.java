package org.thinkyard.app.config;

import static org.thinkyard.app.constant.PropertyConstant.DATASOURCE_DRIVER_CLASS_NAME;
import static org.thinkyard.app.constant.PropertyConstant.DATASOURCE_PASSWORD;
import static org.thinkyard.app.constant.PropertyConstant.DATASOURCE_URL;
import static org.thinkyard.app.constant.PropertyConstant.DATASOURCE_USERNAME;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {

	@Autowired
	private Environment environment;

	@Bean
	@Primary
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty(DATASOURCE_DRIVER_CLASS_NAME));
		dataSource.setUrl(environment.getProperty(DATASOURCE_URL));
		dataSource.setUsername(environment.getProperty(DATASOURCE_USERNAME));
		dataSource.setPassword(environment.getProperty(DATASOURCE_PASSWORD));
		return dataSource;
	}

}
