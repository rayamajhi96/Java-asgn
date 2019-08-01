package Assignment2;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q4 object = new q4();
		object.factorial();	
		

	}
	
	public void factorial() {
		int i, product;
		System.out.println("Enter a number to find factorial :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		product = 1;
		
		for(i = 1; i <= num; i++) {
			product = product * i;
			
		}
	
		
		System.out.println("Factorial :"+ product);


	}
}

