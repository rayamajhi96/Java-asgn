package test;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q3 object3 = new Q3();
		object3.hash();
	}
	
	public void hash() {
		HashMap<Integer, String> first = new HashMap<Integer,String>();
		first.put(1, "Pawan");
		first.put(2, "DavidGilmour526@gmail.com");
		first.put(3, "2345421");
		first.put(4, "Forrest hill drive");
		
		System.out.print(first.values());
		
		
	}

}
