package Assignment2;

import java.util.Scanner;


public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2 ask = new q2();
		ask.find();
		

	}
	
	public void find() {
		int a;
		
		do {
	
			System.out.println("Enter a number :");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
		
			
		}while (a != 0);
		
		System.out.println("You have entered 0");
	
		
	}
	

}
