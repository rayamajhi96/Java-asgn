package Assignment2;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5 draw = new q5();
		draw.flag();

	}

	public void flag() {
		for(int i = 0; i < 9; i++) {
			if(i % 2 == 0 ) {
				System.out.println("* * * * * * =================");
				}
			else {
				System.out.println(" * * * * *  =================");
			}
	
		}
		
		for(int a= 0; a < 6; a++) {
			System.out.println("=============================");
			
		}
		
		
	}
}
