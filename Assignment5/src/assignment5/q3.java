package assignment5;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q3 object3 = new q3();
		object3.convertLower();
	}
	
	public void convertLower() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to be converted :");
		String str = scan.next();
		
		String ans = str.toLowerCase();
		System.out.print("In lower case :"+ ans);
		
		scan.close();
		
	}

}
