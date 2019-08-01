package assignment5;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q5 object5 = new q5();
		object5.find();

	}
	
	public void find() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter digits here :");
		long digit = scan.nextLong();
		
		// First, convert integer to string
		String str = Long.toString(digit);
		
		
		//Second, convert string str into char-type-array
		char[] character = str.toCharArray();
		
		//Third, print length of the array
		System.out.println("Number of digits: "+ character.length);
		
		scan.close();
		
		
		
	}

}
