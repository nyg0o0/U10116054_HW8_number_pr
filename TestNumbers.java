// import java API
import java.util.Scanner;
import java.math.BigDecimal;
public class TestNumbers {
	public static void main(String[] args) {
		// new object for scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter numbers
		System.out.print("Please enter a number: ");
		int number1 = input.nextInt();
		System.out.print("Please enter another number: ");
		int number2 = input.nextInt();
		
		System.out.println("Press 1 for doing addition ");
		System.out.println("Press 2 for doing subtraction ");
		System.out.println("Press 3 for doing multiplication ");
		System.out.println("Press 4 for doing division ");
		int operateType = input.nextInt();
		System.out.println("---------------------------------");
		switch(operateType){
			case 1:System.out.println(number1 + "+" + number2);
				break;
			case 2:System.out.println(number1 + "-" + number2);
				break;
			case 3:System.out.println(number1 + "*" + number2);
				break;
			case 4:System.out.println(number1 + "/" + number2);
				break;
			default:
		
		}
	}
}