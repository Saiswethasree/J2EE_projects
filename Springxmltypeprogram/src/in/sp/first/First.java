package in.sp.first;

public class First 
{
	private String name;
	private int roll;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		System.out.println("name : "+name);
		System.out.println("roll : "+roll);
		System.out.println("email : "+email);
	}
	
}
