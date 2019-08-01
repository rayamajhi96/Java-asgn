package Assignment3;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5 object5 = new q5();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter sales amount: ");
		int num = scan.nextInt();
		object5.commission(num);
		scan.close();

	}
	
	public void commission(int a) {
		if (a < 1000) {
			System.out.println("0% Commission");
		}
		
		else if (a >= 1000 & a < 5000) {
			System.out.println("5% Commission");
		}
		
		else if (a >= 5000 & a < 20000) {
			System.out.println("7% Commission");
			
		}
		
		else if (a >= 20000) {
			System.out.println("10% Commission");
		}
		
	}

}
