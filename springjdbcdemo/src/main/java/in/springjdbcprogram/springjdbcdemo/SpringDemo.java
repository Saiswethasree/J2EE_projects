package in.springjdbcprogram.springjdbcdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringDemo 
{
	@Bean
	public DriverManagerDataSource myDatasource()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/sami");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	@Bean
	public JdbcTemplate myJdbcTemplate()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(myDatasource());
		return jt;
	}
}
