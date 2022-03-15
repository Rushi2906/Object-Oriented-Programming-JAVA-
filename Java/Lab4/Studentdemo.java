class Studentdemo{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.Setdata(15,"Rushi",18);

		Student s2 = new Student();
		s2.Setdata(17,"Gautam",18);
		Student s3 = new Student();
		s3.Setdata(8,"Krish",18);
		s1.Displaydata();
		System.out.println();
		s2.Displaydata();
		System.out.println();
		s3.Displaydata();
	}
}
class Student{
	int enrollment_no;
	String name;
	int age;
	void Setdata(int enrollment_no,String name,int age){
		this.enrollment_no = enrollment_no;
		this.name=name;
		this.age=age;
	}
	void Displaydata(){
		System.out.println("Enrollment no = "+enrollment_no);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
}