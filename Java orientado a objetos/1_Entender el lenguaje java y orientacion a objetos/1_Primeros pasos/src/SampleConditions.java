
public class SampleConditions {
	public static void main(String[] args) {

		// if - else
		int age = 18;
		int people = 2;
		
		boolean inGroup = people > 1;
		System.out.println("The person is in a group: " + inGroup);	
		
		boolean canLogin = age >= 18 && inGroup;

		if (canLogin) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login denied");
		}
		
		
		//switch
		int number = 10;
		
		switch(number) {
			case 1:
				System.out.println("The number is 1");
				break;
			case 2:
				System.out.println("The number is 2");
				break;
			case 3:
				System.out.println("The number is 3");
				break;
			case 4:
				System.out.println("The number is 4");
				break;
			case 5:
				System.out.println("The number is 5");
				break;
			case 6:
				System.out.println("The number is 6");
				break;
			case 7:
				System.out.println("The number is 7");
				break;
			case 8:
				System.out.println("The number is 8");
				break;
			case 9:
				System.out.println("The number is 9");
				break;
			case 10:
				System.out.println("The number is 10");
				break;
			case 11:
				System.out.println("The number is 11");
				break;
			case 12:
				System.out.println("The number is 12");
				break;
			default:
				System.out.println("NaN or out of scope");
				break;
		}
	}
}
