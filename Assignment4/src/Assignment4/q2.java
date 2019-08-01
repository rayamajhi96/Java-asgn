package Assignment4;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static double pi = 3.14;
		q2 object2 = new q2();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		double radius = scan.nextDouble();
		
		object2.findDiameter(radius);
		object2.findCircumference(radius);
		object2.findArea(radius);
		
		scan.close();	

	}
	
	public void findDiameter(double num1) {
		double diameter = 2 * num1;
		System.out.println("The diameter :"+ diameter);
	}
	
	public void findCircumference(double num1) {
		double pi = 3.14;
		double circum = 2 * pi * num1;
		System.out.println("Circumference :"+circum);
		
	}
	
	public void findArea(double num) {
		double pi = 3.14;
		double area = pi * num * num;
		System.out.println("Area :"+area);
	}

}
