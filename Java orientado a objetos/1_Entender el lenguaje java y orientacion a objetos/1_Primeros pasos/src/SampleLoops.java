
public class SampleLoops {
	public static void main(String[] args) {
		
		// while
		System.out.println("While loop");
		int whileCount = 0;
		int whileTotal = 0;
		while (whileCount <= 10) {
			System.out.println(whileCount);
			whileTotal = whileTotal + whileCount;
			whileCount ++;
		}
		System.out.println("Sum of counts: " + whileTotal);
		
		
		// for
		System.out.println("For loop");
		for (int forCount = 0; forCount <= 10; forCount++) {
			System.out.println(forCount);
		}
	}
}
