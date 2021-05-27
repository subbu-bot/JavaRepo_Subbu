package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "walsh";
		String str2 = "shawl";
		
		if(str1.length()==str2.length()) {
			System.out.println("Both words are of same lenth, it is "+ str2.length());
			
		}
		else {
			System.out.println("Both words are of different lenth");
		}
		
		char[] strchar1 = str1.toCharArray();
		char[] strchar2 = str2.toCharArray();
		
		Arrays.parallelSort(strchar1);
		Arrays.parallelSort(strchar2);
		
		boolean isArrayEqual = Arrays.equals(strchar1, strchar2);
		System.out.println("Are they Anagram now? "+ isArrayEqual);
		
		
		}
		
		
		
	}


