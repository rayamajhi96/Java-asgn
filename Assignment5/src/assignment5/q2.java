package assignment5;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2 object2 = new q2();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time in seconds: ");
		long time = scan.nextLong();
		object2.convert(time);
		scan.close();

	}
	
	public void convert(long num) {
		long hr = num / 3600;
	
		long diff1 = num - (3600*hr);
		
		long min = diff1/60;
		
		long diff2 = diff1 - (60*min);
		
		//long sec = min / 60;
		
		System.out.println("Equivalent to: "+ hr +":" + min+":"+diff2);
		
		
		
	}

}
