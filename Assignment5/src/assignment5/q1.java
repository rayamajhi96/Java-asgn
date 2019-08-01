package assignment5;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1 object1 = new q1();
		object1.convert();

	}
	
	public void convert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to be converted:  ");
		String str = scan.next();
		
		//Convert string to character arrays using .toCharArray
		char[] character = str.toCharArray();
		scan.close();
		
	
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(character[i]);
			char ans = character[i];
			int num = (int) ans;
			System.out.println("Converted to :"+num);
			
	
		}
		
		
		
		
	}

}
