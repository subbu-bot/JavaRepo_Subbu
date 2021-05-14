package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5,6,7,9};
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!= (i+1)) {
			System.out.println("Missing Number is :"+ (i+1));
			break;
			}
			}
			
			
		}
	}


