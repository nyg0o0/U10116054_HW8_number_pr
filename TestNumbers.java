// import java API
import java.util.Scanner;
import java.math.BigDecimal;
public class TestNumbers {
	public static void main(String[] args) {
		// new object for scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter numbers
		System.out.print("Please enter a number: ");
		double number1 = input.nextInt();
		System.out.print("Please enter another number: ");
		double number2 = input.nextInt();
		
		System.out.println("Press 1 for doing addition ");
		System.out.println("Press 2 for doing subtraction ");
		System.out.println("Press 3 for doing multiplication ");
		System.out.println("Press 4 for doing division ");
		int operateType = input.nextInt();
		System.out.println("---------------------------------");
		BigDecimalNum operation = new BigDecimalNum(number1,number2);
		switch(operateType){
			case 1:System.out.println(number1 + "+" + number2);
					operation.add();
				break;
			case 2:System.out.println(number1 + "-" + number2);
				operation.subtract();
				break;
			case 3:System.out.println(number1 + "*" + number2);
				operation.multiply();
				break;
			case 4:System.out.println(number1 + "/" + number2);
				operation.divide();
				break;
			default:
		
		}
	}
}