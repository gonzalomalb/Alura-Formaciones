
public class SampleScope {
	public static void main(String[] args) {

		// scope of variables
		int number = 2;
		
		boolean biggerThanOne; // variable initialized
		if (number > 1) {
			biggerThanOne = true;
		} else {
			biggerThanOne = false;
		}
		
		System.out.println(biggerThanOne); // print will work since variable was initialized earlier
		
	}
}
