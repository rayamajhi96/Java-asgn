package Assignment4;



public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q8 object8 = new q8();
		
		//Declare array here
		int[] arrayList = {34,45,76,90,68, 0,90};
		
		int num = object8.findSize(arrayList);
		System.out.println("The array is of size :"+num);
	}
	
	public int findSize(int[] alist) {
		return alist.length;
	}

}
