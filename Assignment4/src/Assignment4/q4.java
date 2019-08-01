package Assignment4;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q4 object4 = new q4();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check even/odd: ");
		int num1 = scan.nextInt();
		String fact = object4.find(num1);
		System.out.println("The number is :"+ fact);	
		scan.close();

	}
	
	public String find(int num) {
		if (num % 2 == 0) {
			return "Even";
		}
		
		else {
			return "Odd";
		}
	}

}
