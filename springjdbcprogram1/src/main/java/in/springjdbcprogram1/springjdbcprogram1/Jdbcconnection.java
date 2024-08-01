package in.springjdbcprogram1.springjdbcprogram1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Jdbcconnection 
{
	@Bean
	public DriverManagerDataSource mySource()
	{
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/ganapathi");
		dm.setUsername("root");
		dm.setPassword("root");
		return dm;
	}
	@Bean
	public JdbcTemplate mytemplate()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(mySource());
		return jt;
		
	}
	
}
