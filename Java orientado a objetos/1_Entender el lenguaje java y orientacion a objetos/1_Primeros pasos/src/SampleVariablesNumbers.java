
public class SampleVariablesNumbers {
	public static void main(String[] args){
			
		//variable INT
		int number = 12;
		int age = 16;
		age = age + number;
		System.out.println("I'm " + age + " years old" );
		
		int divAge = age / 3;
		System.out.println("Using an int variable, my age divided by 3 is: " + divAge);
		
		
		//variable DOUBLE
		double salary = 1250.56;
		System.out.println("My salary is: $" + salary);
		
		double halfSalary = salary / 2;
		System.out.println("Using a double variable, my salary divided by half is: $" + halfSalary);
		
		
		//long, medium, short & byte (numbers)
		long longNumber = 1222222222222222222L; //64-bits variable (defined with L at the end)
		System.out.println("Long number variable: " + longNumber);
		int mediumNumber = 1222222222; //32-bits variable (int, float)
		System.out.println("Medium number variable: " + mediumNumber);
		short shortNumber = 12222; //16-bits variable (short, char)
		System.out.println("Short number variable: " + shortNumber);
		byte byteNumber =  122; //8-bits variable
		System.out.println("Byte number variable: " + byteNumber);
	}
}
