package Assignment4;



public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q6 object6  = new q6();
		object6.sum();
		

	}
	
	public void sum() {
		
		//int arrayList[] = new int [10];
		//Assign value to array containing 10 values here
		
		int[] arrayList = {1,1,1,1,1,1,1,1,0,1};
		int sum = 0;
		for(int i = 0; i < arrayList.length; i++) {
			sum = sum + arrayList[i];
		}
		
		System.out.println("The total sum of given array is :"+ sum);
		
		
		
	}

}
