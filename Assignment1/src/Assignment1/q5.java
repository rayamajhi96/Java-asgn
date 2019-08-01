package Assignment1;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5 area = new q5();
		area.calculate();
		

	}
	
	public void calculate() {
		
		int a,b,t;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base :");
		a = scan.nextInt();
		System.out.print("Enter height :");
		b = scan.nextInt();
		
		t = (a*b);
		
		System.out.print("Area of triangle: " + t);

		
		
		
	}

}
