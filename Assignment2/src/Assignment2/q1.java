package Assignment2;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1 loop = new q1();
	
		loop.forloop();
		loop.whileloop();
		loop.dowhileloop();

	}
	
	public void forloop() {
		System.out.println("Using For loop :");
		int i;
		for(i=0; i<10; i++) {
			System.out.println((i+1) + " Pawan Rayamajhi");
		}
		System.out.println();
		
	}
	
	public void whileloop() {
		System.out.println("Using While loop :");
		int i = 1;
		while(i <= 10) {
			System.out.println(i + " Pawan Rayamajhi");
			i ++;
			
		}
		System.out.println();
		
	}
	
	public void dowhileloop() {
		System.out.println("Using Do-while loop :");
		int i = 1;
		do {
			System.out.println(i +" Pawan Rayamjhi");
			i ++;
		} while(i < 11);
		
		
	}

}
