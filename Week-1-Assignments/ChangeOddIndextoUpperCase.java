package week1.day2;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args) {
		
		String test = "nikolatesla";
		char[] strchar = test.toCharArray();
		
		for (int i = 0; i < strchar.length; i++) {
			
			if(i%2 == 1) {
				
			strchar[i] = Character.toUpperCase(strchar[i]);
			System.out.print(strchar[i]);
				
			}
			
			else {
				System.out.print(strchar[i]);
			}
		

	}

}}
