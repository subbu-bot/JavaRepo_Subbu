package week1.day2;

public class Palindrome {

	public static void main(String[] args) { 
		String valueX = "MAIAM";
		String Rev = "";
		
		for (int i = valueX.length()-1; i >= 0; i--) {
			Rev = Rev+valueX.charAt(i);
			}
		if(valueX.equalsIgnoreCase(Rev)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}

}
