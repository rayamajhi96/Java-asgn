package Assignment4;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q5 object5 = new q5();
		object5.arrayList();

	}
	
	public void arrayList() {
		//Declaration
		int elements[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < elements.length; i++) {
			System.out.println("Enter "+(i+1)+" element :");
			int num = scan.nextInt();
			elements[i] = num;
			
		}
		
		//System.out.println(elements);
		
		for(int i = 0; i < elements.length; i++) {
			System.out.println("Array contains "+ elements[i]);
			
		}
		
		scan.close();
		
		
	}

}
