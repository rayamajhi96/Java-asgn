package Assignment4;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q10 object10 = new q10();
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		object10.giveReverse(array);
	}
	
	public void giveReverse(int [] list) {
		int[] reverse = new int [10];
		for (int i = 0; i < list.length; i++) {
			reverse[(list.length -1)-i] = list[i];
			
		}
		
		System.out.println("The reversed order given by :");
		for(int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]+",");			
		}
	}

}
