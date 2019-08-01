package Assignment4;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q9 object9 = new q9();
		int[] givenArray = {1,2,3,4,5,6,7,7,0,9};
		object9.find(givenArray);	

	}
	
	public void find(int[] array) {
		int evenCounter = 0, oddCounter = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				evenCounter = evenCounter + 1;
			}
			else {
				oddCounter = oddCounter + 1;
			}
		}
		
		System.out.println("Number of evens :"+ evenCounter);
		System.out.println("Number of odd :" + oddCounter);
	}

}
