// import java API
import java.util.Scanner;
import java.math.BigDecimal;
public class TestNumbers {
	public static void main(String[] args) {
		// new object for scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter numbers
		System.out.print("Please enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Please enter another number: ");
		double number2 = input.nextDouble();
		System.out.println("---------------------------------");
		System.out.println("Press 1 for doing addition ");
		System.out.println("Press 2 for doing subtraction ");
		System.out.println("Press 3 for doing multiplication ");
		System.out.println("Press 4 for doing division ");
		System.out.println("---------------------------------");
		System.out.print("Your choice: ");
		int operateType = input.nextInt();
		System.out.println("---------------------------------");
		BigDecimalNum operation = new BigDecimalNum(number1,number2);
		switch(operateType){
			case 1:
				System.out.println(number1 + " + " + number2 + " = " + operation.add());
				break;
			case 2:
				System.out.println(number1 + " - " + number2 + " = " + operation.subtract());
				break;
			case 3:
				System.out.println(number1 + " * " + number2 + " = " + operation.multiply());
				break;
			case 4:
				if( number2 == 0 ){
					System.out.println("You can not divide by zero!!");
					System.exit(1);
				}
				System.out.print("Please enter the scale after decimal point: ");
				int scaleAfterPoint = input.nextInt();
				if( scaleAfterPoint < 0 ){
					System.out.println("Your input is illegal!");
				}
				else{
					System.out.println(number1 + " / " + number2 + " = " + operation.divide(scaleAfterPoint));
				}
				break;
			default:
				System.exit(1);
		}
	}
}