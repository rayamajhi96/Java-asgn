package Assignment1;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q6 asc = new q6();
		asc.convert();
		
	}
	
	public void convert(){
		
		//String a = new String();
		
		char a;
		
		System.out.print("Give character to be converted :");
		Scanner scan = new Scanner(System.in);
		

		a = scan.next().charAt(0);
		
		int result = (int) a;
		System.out.print("ASCII Value :" + result);
		
		
		
			
		
	}

}
