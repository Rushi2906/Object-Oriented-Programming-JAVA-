class Member
{
	String name="member";
	int age=33;
	long phone_number=1234567890;
	String address="address";
	double salary=2000.80;
	void display(){
	System.out.println("name : "+name);
	System.out.println("age : "+age);
	System.out.println("Phone number : "+phone_number);
	System.out.println("Address : "+address);
	}
	void printsalary(){
	System.out.println("salary : "+salary);
	}
}
class Employee extends Member
{
	String specialization="specialization";
	void display(){
	System.out.println("specialization : "+specialization);
	}
}
class Manager extends Member
{
	String department="cse";
	void display(){
	System.out.println("department : "+department);
	}
}
public class Memberdemo{
	public static void main(String[] args)
	{
		Member m1=new Member();
		m1.display();
		m1.printsalary();
		Employee m2 = new Employee();
		m2.display();
		Manager m3 = new Manager();
		m3.display();
	}
}