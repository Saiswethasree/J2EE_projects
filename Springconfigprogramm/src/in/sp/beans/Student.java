package in.sp.beans;

public class Student 
{
	private int id;
	private String name;
	private String company;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(company);
	}
}
