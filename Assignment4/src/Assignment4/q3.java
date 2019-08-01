package Assignment4;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q3 object3 = new q3();
		int ans = object3.findMin();
		System.out.println("The smallest num is: "+ans);

	}
	
	public int findMin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number :");
		int num2 = scan.nextInt();
		
		scan.close();
		if(num1 < num2) {
			return num1;
		}
		
		else{
			return num2;
		}
		
		
	}

}
