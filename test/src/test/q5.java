package test;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5 object5 = new q5();
		object5.employee();

	}
	
	public void employee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name :");
		String fName = scan.next();
		
		System.out.println("Enter Last name :");
		String lName = scan.next();
		
		//convert to lower case
		
		String first = fName.toLowerCase();
		String last = lName.toLowerCase();
		
		//Store last name into array of characters
		char[] str = first.toCharArray();
		System.out.println("Username: "+fName+"."+lName);
		System.out.println("Email: "+str[0]+last+"@dexperts.local");
		
		scan.close();
	}

}
