package assignment5;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q6 object6 = new q6();
		object6.findSum();
	}
	
	public void findSum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter digits :");
		long digit = scan.nextLong();
		
		//convert to string
		String str = Long.toString(digit);
		
		//creates array of characters
		char[] character = str.toCharArray();
		scan.close();
		
		int sum = 0;
		
		for(int i = 0; i < character.length; i++) {
			
			//Converts each character to ascii
			int a = (int) character[i];

			//Correction for ASCII value
			sum = sum + a - 48;
		}
		
		System.out.println("The sum is : " + sum);
	}

}
