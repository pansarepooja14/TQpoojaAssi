package Abstraction;
//lambda expression  ()   ->  functional interface
// to reduce the code lines


//Why use Lambda Expression
//To provide the implementation of Functional interface.
//Less coding.

//1) Argument-list: It can be empty or non-empty as well.

//2) Arrow-token: It is used to link arguments-list and body of expression.

//3) Body: It contains expressions and statements for lambda expression.
public class Circle {

	public static void main(String[] args) {
		
		area a=()->{
			int l=2,b=3;
			System.out.println(l*b);
			};
		a.show_area();
			
		
		
	}

}
