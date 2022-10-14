
public class SampleVariablesValues {
	public static void main(String[] args) {
		
		//Values of variables
		int number1 = 5;
		int number2 = 9;
		System.out.println("The value of the variable number2 is: " + number2);
		
		number2 = number1; //At this point the value of the variable is saved.
		System.out.println("The value of the variable number2 is: " + number2);
		
		number1 = 88;
		// number2 = ????
		System.out.println("The value of the variable number2 is: " + number2); //The value of number2 was never changed.
	}
}
