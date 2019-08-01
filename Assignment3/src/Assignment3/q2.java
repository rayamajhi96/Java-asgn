package Assignment3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args){
		q2 object2 = new q2();
		object2.check();
		
	}
	
	public void check() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int a = scan.nextInt();
		
		System.out.println("Enter second number :");
		int b = scan.nextInt();
		
		System.out.println("Enter third number :");
		int c = scan.nextInt();
		
		System.out.println("Among :"+ a + " , " + b + " , "+ c);
		
		if(a < b && a < c ) {
			System.out.print(a + " is smaller");
		}
		
		else if (b < a && b < c) {
			System.out.println(b +" is smaller");
		}
		
		else if (c < a && c < b) {
			System.out.println(c +" is smaller");
		}
			
		
		
	}
}
