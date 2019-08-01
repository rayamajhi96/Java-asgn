package Assignment1;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2 subject = new q2();
		subject.calculate();
		
	}
	
	public void calculate() {
		double a,b,c,d,e,avg,tot,per;
		
		Scanner ok = new Scanner(System.in);
		System.out.print("Enter marks for first subject: ");
		a = ok.nextDouble();
		
		System.out.print("Enter marks for second subject: ");
		b = ok.nextDouble();
		
		System.out.print("Enter marks for third subject: ");
		c = ok.nextDouble();
		
		System.out.print("Enter marks for forth subject: ");
		d = ok.nextDouble();
		
		System.out.print("Enter marks for fifth subject: ");
		e = ok.nextDouble();
		
		tot = a+b+c+d+e;
		avg = tot/5;
		per = tot/500*100;
		
		System.out.print("Total Score :" + tot + "\n" + "Average :"+ avg +"\n"+ "Percentage :" + per);
		
		
	}

}
