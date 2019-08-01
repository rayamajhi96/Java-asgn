package Assignment2;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q3 sum = new q3();
		sum.calculate();
		
	}
	
	public void calculate() {
		int i, avg;
		int sum = 0;
		for (i = 0 ; i < 10; i++) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter " + (i+1) + " Number :");
			int a = scan.nextInt();
			sum = sum + a;
			
		}
		
		avg = sum / 100 * 100;
		//System.out.println("Value of i :" + i);
		System.out.println("Total percentage :" + avg + "%");
		System.out.println("Total sum of numbers :"+ sum);
	}
	
	

}
