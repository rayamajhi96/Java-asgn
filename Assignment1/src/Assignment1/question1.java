package Assignment1;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1 temp = new question1();
		temp.convert();

	}
	
	public void convert() {
		
		double celcius, fahrenheit;
		Scanner ok = new Scanner(System.in);
		System.out.print("Enter temperature in Celcius: ");
		celcius = ok.nextDouble();
		fahrenheit = celcius + 32;
		System.out.print("The eqivalent temperature in Fahrenheit: "+ fahrenheit);
		ok.close();
		
		
	}

}
