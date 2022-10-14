
public class TestMultiplyChart {
	public static void main(String[] args) {
		
		for (int count = 1; count <= 10; count++) {
			System.out.println("Multiples of: " + count);
			for (int multiplier = 0; multiplier <= 10; multiplier++) {
				System.out.print(count * multiplier);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
