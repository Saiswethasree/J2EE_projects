package in.springjdbcprogram.springjdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	int id=12;
    	String name="sai";
    	String address="atp";
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemo.class);
    	JdbcTemplate j = context.getBean(JdbcTemplate.class);
    	String query = "INSERT INTO KK VALUES(?,?,?)";
    	int count = j.update(query,id,name,address);
    	if(count>0)
    	{
    		System.out.println("success");
    	}
    	else
    	{
    		System.out.println("no");
    	}
    }
}
