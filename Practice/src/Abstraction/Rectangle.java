package Abstraction;

public class Rectangle implements area{
	
	@Override
	public void show_area() {
		int l=34,b=10;
		System.out.println("area of rectangle is..."+(l*b));
		
	}

	public static void main(String[] args) {
		area a=new Rectangle();
		a.show_area();

	}

	

}
