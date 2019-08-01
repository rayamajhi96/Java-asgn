package Assignment4;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q1 object1 = new q1();
		object1.cube();
	}
	
	public void cube() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find its cube :");
		int num = scan.nextInt();
		int cubee = num*num*num;
		System.out.println("Its cube is: "+ cubee);
		scan.close();
		
		
		
	}
	

}
