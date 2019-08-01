package Assignment4;

public class q7 {
	
	public static void main(String[] args) {
		q7 object7 = new q7();
		object7.findMax();
		
	}
	
	public void findMax() {
		int[] elements = {-1,2,3,4,59,6,7,800,9,100,11,120};
		int max = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i]>max) {
				max = elements[i];
			}
			
		}
		
		System.out.println("The max among is :"+ max);
		
	}

}
