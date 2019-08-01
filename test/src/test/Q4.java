package test;

import java.util.*;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q4 object4 = new Q4();
		String ans = object4.check();
		System.out.println(ans);
	}
	
	public String check() {
		List<String> email = new ArrayList<String>();
		
		email.add("john@gmail.com");
		email.add("suyog@dexperts.local");
		email.add("isThisHowWorldEnds@gmail.com");
		email.add("floralMask@gmail.com");
		email.add("thisisit@ibmm.co");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email address to check: ");
		String and = scan.next(); 
		scan.close();
		
		if (email.contains(and)) {
			return "Email already exist";
		}
		
		else {
			return "Email not found";
		}
		/*
		 * System.out.println(email.get(2)); for (int i = 0; i < email.size(); i++) { if
		 * (email.get(i) == and) { return "Email already exist"; } }
		 * 
		 * return "Email not found";
		 */
		
		
	}

}
