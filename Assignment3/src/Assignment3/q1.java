package Assignment3;

import java.util.Scanner;

public class q1 {
	
	public static void main(String[] args) {
		q1 object1 = new q1();
		
		object1.check();
		
	}
	
	public void check() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check :");
		int num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("The number "+ num +" is negative");
		}
		
		else {
			System.out.println(num +" is positive");
		}
		
		
	}

}
