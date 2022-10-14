
public class SampleChars {
	public static void main(String[]args) {
		//variable char(defined by simple quotes)
		char caracter = 'a';
		System.out.println("Variable char can only support one character(letters and number): " + caracter);
		
		caracter = 65;
		System.out.println("Value of variable char when using numbers is the corresponding character in ascii chart: " + caracter);
		
		char caracter2 = (char)(caracter + 1);
		System.out.println("When using number we can use operators to modified the value of the character: " + caracter2);
	}
}
