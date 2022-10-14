
public class SampleConversion {
	public static void main(String[] args) {
		
		//conversion
		double variable1 = 230.89;
		System.out.println("Value of variable1: " + variable1);
		
		int variable1Int = (int) variable1;  // Cast
		System.out.println("Value of variable1 after conversion: " + variable1Int);
		
		int result = (int) variable1 + variable1Int;
		System.out.println("Result of the sum of both variables assign to a new int variable: " + result);
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        float total = (float) valor1 + (float) valor2; // Cast - floating point number

        System.out.println(total);
	}
}
