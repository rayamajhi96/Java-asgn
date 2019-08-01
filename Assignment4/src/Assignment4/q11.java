package Assignment4;

//import java.util.Arrays;
import java.util.Scanner; 

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q11 object11 = new q11();
		// Declare array of length 12
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to see in array :");
		int num = scan.nextInt();
		
		System.out.println("Enter elements in array of size 12");
		String ans = object11.declareArray(num);
		System.out.println(ans);
		
		scan.close();
		
	}
	
	public String declareArray(int integer) {
		int [] arrayList = new int[12];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arrayList.length; i++) {
			System.out.print("Enter "+(i+1)+" element: ");
			int num = scan.nextInt();
			arrayList[i] = num;
		}
		
	
		scan.close();
		
		  for(int i = 0; i < arrayList.length; i++) {
			  while(arrayList[i] == integer) {
				  return integer +" is found";
			  }
			  
		  } 
		  
		  return integer + " not found";		 
		  
		
}
	

}
