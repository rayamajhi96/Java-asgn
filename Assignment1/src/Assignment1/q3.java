package Assignment1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q3 interest = new q3();
		interest.calculate();
		

	}
	
	public void calculate() {
		double p,t,r,interes;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter principle: ");
		p = scan.nextDouble();
		System.out.print("Enter time :");
		t = scan.nextDouble();
		System.out.print("Enter rate :");
		r = scan.nextDouble();
		
		interes = (p*t*r) / 100;
		System.out.print("Simple interest :" + interes);
		
		scan.close();
		
		
	}

}
