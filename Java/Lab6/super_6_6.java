class Animal{
	public void printValue(){
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	
	public void printValue(){
		System.out.println("Dog Bark");
	}
	public void print(){
		super.printValue();
		printValue();
	}
}
class super_6_6{
	public static void main(String [] args){
		Dog obj = new Dog();
		obj.print();
	}
}