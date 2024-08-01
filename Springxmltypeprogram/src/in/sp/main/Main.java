package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.first.First;

public class Main {

	public static void main(String[] args) {
		String s = "in/sp/context/App.xml";
		ApplicationContext context = new  ClassPathXmlApplicationContext(s);
		First b = (First) context.getBean("stdid1");
		b.display();
	}

}
;