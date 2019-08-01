package Assignment3;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q4 object4 = new q4();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age of a person :");
		int age = scan.nextInt();
		String remarks = object4.giveAge(age);
		System.out.println(remarks);
		scan.close();

	}
	
	public String giveAge(int num) {
		if (num < 12) {
			return "Child";
		}
		
		else if (num >= 12 & num < 20) {
			return "Teen";
		}
		
		else if (num >= 20 & num < 30) {
			return "Adult";
		}
		else if (num >= 30 & num < 55) {
			return "Young";
		}
		else if (num >= 55) {
			return "Old";
		}
		
		return "invalid";
		
		
	}

}
