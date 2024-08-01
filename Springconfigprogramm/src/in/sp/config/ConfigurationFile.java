package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class ConfigurationFile 
{
	@Bean
	public Student stdid()
	{
		Student std = new Student();
		
		std.setId(12);
		std.setName("swetha");
		std.setCompany("tcs");
		
		return std;
	}
}
