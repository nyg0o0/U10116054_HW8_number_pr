// import java API
import java.util.Scanner;

public class TestNumbers {
	public static void main(String[] args) {
		// new an object for scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter numbers
		System.out.print("Please enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Please enter another number: ");
		double number2 = input.nextDouble();
		
		// choices of operation for users
		System.out.println("---------------------------------");
		System.out.println("Press 1 for doing addition ");
		System.out.println("Press 2 for doing subtraction ");
		System.out.println("Press 3 for doing multiplication ");
		System.out.println("Press 4 for doing division ");
		System.out.println("---------------------------------");
		
		// scanner the options
		System.out.print("Your choice: ");
		int operateType = input.nextInt();
		System.out.println("---------------------------------");
		
		// create an object for BigDecimalNum class
		BigDecimalNum operation = new BigDecimalNum(number1,number2);
		
		/* switchs for operation*/
		switch(operateType){
			case 1: // add
				System.out.println(number1 + " + " + number2 + " = " + operation.add());
				break;
			case 2:	// subtract
				System.out.println(number1 + " - " + number2 + " = " + operation.subtract());
				break;
			case 3:	// multiply
				System.out.println(number1 + " * " + number2 + " = " + operation.multiply());
				break;
			case 4:	// divide
				if( number2 == 0 ){	// if dividend is equal to zero, can not doing operation
					System.out.println("You can not divide by zero!!");
					System.exit(1);
				}
				
				// to make it more precise, scan the scale from user input
				System.out.print("Please enter the scale after decimal point: ");
				int scaleAfterPoint = input.nextInt();
				if( scaleAfterPoint < 0 ){	// illegal scale
					System.out.println("Your input is illegal!");
				}
				else{	// if scale is legal, show the answer
					System.out.println(number1 + " / " + number2 + " = " + operation.divide(scaleAfterPoint));
				}
				break;
			default:
				System.exit(1);
		}
	}
}