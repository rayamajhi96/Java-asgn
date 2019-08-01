package assignment5;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q4 object4 = new q4();
		object4.findPrime();

	}
	
	public void findPrime() {
		for(int i = 1; i <= 100; i++ ) {
			int count = 1;
			for(int j = 1; j<= 100; j++) {
				
				if (i % j == 0) {
					
					//count = count + 1;
					System.out.println(j);
					count = count + 1;
					//System.out.println(count);
				}
			}

		}
	}

}
