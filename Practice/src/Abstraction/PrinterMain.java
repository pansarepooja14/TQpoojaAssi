package Abstraction;

interface printer
{
	public static final String date="2020-08-23";
	public abstract void print();
	
}

class Employee implements printer
{
	
	String name="Mr.Ram";
	int age=45;
	String cname="TATA";
	
    @Override
	public void print() {
    	
		System.out.println("name is..."+name);
		System.out.println("age is...."+age);
		System.out.println("company name is.."+cname);
		System.out.println("date is...."+date);
		
	}
	
}

class Student implements printer
{
	
	String name="supriya";
	int age=22;
	String colname="D.Y.Patil";
	
    @Override
	public void print() {
    	
		System.out.println("name is..."+name);
		System.out.println("age is...."+age);
		System.out.println("company name is.."+colname);
		System.out.println("date is...."+date);
		
	}
	
}

public class PrinterMain {

	public static void main(String[] args) {
		printer p;
		p=new Employee();
		p.print();
		p=new Student();
		p.print();



	}

}
