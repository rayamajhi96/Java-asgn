package Assignment1;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q4 small = new q4();
		small.find();
		
	}
	
	public void find() {
		int a , b, result;

		
		Scanner scan = new Scanner(System.in);
		System.out.print("First number :");
		a = scan.nextInt();
		
		System.out.print("Second number :");
		b = scan.nextInt();
		
		result = (a < b) ? a : b ;
		System.out.print (result + " is smaller");
		
		
		
	}

}
