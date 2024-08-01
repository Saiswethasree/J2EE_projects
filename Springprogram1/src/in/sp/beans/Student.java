package in.sp.beans;

public class Student 
{
	private String name;
	private int roll;
	private int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("name :"+name);
		System.out.println("rollno :"+roll);
		System.out.println("marks :"+marks);
	}
}
