package in.springjdbcprogram1.springjdbcprogram1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	int id =111;
    	String name = "sree";
    	String color = "white";
        ApplicationContext ac = new AnnotationConfigApplicationContext(Jdbcconnection.class);
        JdbcTemplate j = ac.getBean(JdbcTemplate.class);
        String query = "INSERT INTO Krish VALUES(?,?,?)";
    	int count = j.update(query,id,name,color);
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
