//Lab 6_3

class Member{
	String name;
	int age;
	String phoneno;
	String address;
	double salary;
	public Member(String name,int age,String phoneno,String address,double salary){
		this.name=name;
		this.age=age;
		this.phoneno=phoneno;
		this.address=address;
		this.salary=salary;		
	}
	public void printSalary(){
		System.out.println("Salary= "+salary);
	}
}

class Employee extends Member{
	String specialization;
	public Employee(String name,int age,String phoneno,String address,double salary,String specialization){
		super(name,age,phoneno,address,salary);
		this.specialization=specialization;
	}
	public void printEmployee(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneno);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(specialization);
	}
}

class Manager extends Member{
	String department;
	public Manager(String name,int age,String phoneno,String address,double salary,String department){
		super(name,age,phoneno,address,salary);
		this.department=department;
	}
	public void printManager(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(phoneno);
		System.out.println(address);
		System.out.println(department);
	}
}

public class Memberdemo_6_3{
	public static void main(String [] args){
		Employee e = new Employee("abc",123,"123","asdf",123.123,"asdf");
		Manager m = new Manager("abc",123,"123","asdf",123.123,"comp");
		e.printEmployee();
		m.printManager();
	}
}