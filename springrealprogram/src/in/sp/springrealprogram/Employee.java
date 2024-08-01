package in.sp.springrealprogram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("swetha")
	private String name;
	@Value("12")
	private int id;
	@Value("atp")
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
	}
}
