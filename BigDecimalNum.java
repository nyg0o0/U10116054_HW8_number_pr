// import
import java.math.BigDecimal;

class BigDecimalNum{
	BigDecimal num1;
	BigDecimal num2;
	
	// constructor
	BigDecimalNum(double number1,double number2){
		num1 = new BigDecimal(Double.toString(number1));
		num2 = new BigDecimal(Double.toString(number2));
	}	

	double add(){

		return num1.add(num2).doubleValue();
	}

	double subtract(){
		return num1.subtract(num2).doubleValue();
	}

	double multiply(){
		return num1.multiply(num2).doubleValue();
	}

	double divide(){
		return 0;
	}
}