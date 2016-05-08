import java.math.BigDecimal;
class BigDecimalNum{
	BigDecimal num1;
	BigDecimal num2;

BigDecimalNum(BigDecimal newNum1, BigDecimal newNum2){
	num1 = new BigDecimal(newNum1);
	num2 = new BigDecimal(Double.toString(newNum2));	
	
}	

double add(double number1,double number2){

	return num1.add(num2).doubleValue();
}

double subtract(double number1,double number2){
	return num1.subtract(num2).doubleValue();
}

double multiply(double number1,double number2){
	return num1.multiply(num2).doubleValue();
}

double divide(double number1,double number2){

}
}