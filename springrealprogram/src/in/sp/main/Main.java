package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.springrealprogram.Employee;

public class Main {

	public static void main(String[] args) 
	{
		String s = "in/sp/config/config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(s);
		Employee e = (Employee) context.getBean("Employee");
		e.display();
	}

}
