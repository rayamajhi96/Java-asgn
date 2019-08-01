package Assignment3;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q3 object3 = new q3();
		object3.check();	

	}
	
	public void check() {
		Scanner scan = new Scanner(System.in);
		int i;
		double percent, sum = 0;
		for( i = 1 ; i <=5  ; i++) {
			System.out.println("Enter mark for "+ i +" subject :");
			int num = scan.nextInt();
			sum = sum + num;
		
		}
		System.out.println("The total sum be :"+ sum);
		
		percent = sum / 500 * 100;
		//System.out.println(percent);
		
		System.out.println("The percentage is given as "+ percent);
		//System.out.println("The total sum be :"+ sum);
		scan.close();
		grade(percent);
		
		
	}
	
	public void grade(double eg) {
		if (eg >= 60.0 & eg <80) {
			System.out.print("First division");
			
		}
		else if (eg >= 80.0) {
			System.out.println("Distinction");
			
		}
		
		else if (eg < 60.0 && eg >= 50.0) {
			System.out.println("Second Division");
		}
		
		else if (eg < 50.0 && eg >= 40.0) {
			System.out.println("Third division");
			
		}
		else if (eg < 40.0) {
			System.out.println("Fail");
		}
		
	}

}
