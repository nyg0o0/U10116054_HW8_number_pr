// import java API
import java.math.BigDecimal;

class BigDecimalNum{
	// creat two objects for bigDecimal class
	BigDecimal num1;
	BigDecimal num2;
	
	// constructor
	BigDecimalNum(double number1,double number2){
		num1 = new BigDecimal(Double.toString(number1));
		num2 = new BigDecimal(Double.toString(number2));
	}	

	// a function for addition
	double add(){
		return num1.add(num2).doubleValue();
	}

	// a function for subtraction
	double subtract(){
		return num1.subtract(num2).doubleValue();
	}

	// a function for multiplication
	double multiply(){
		return num1.multiply(num2).doubleValue();
	}

	// a function for division (pass the scale to make the answer more precisely)
	double divide(int scaleAfterPoint){
		return num1.divide(num2,scaleAfterPoint,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}