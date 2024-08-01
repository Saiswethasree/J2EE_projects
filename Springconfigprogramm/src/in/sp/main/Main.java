package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.config.ConfigurationFile;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		
		Student st = (Student) context.getBean("stdid");
		
		st.display();
	}
}
