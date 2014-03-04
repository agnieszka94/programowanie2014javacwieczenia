package cwiczenia02;

import java.util.Scanner;

class Tac {
	public static void main(String[] args) {
	    Stack s = new Class02IncorrectStack(1000);
	    Scanner sca = new Scanner(System.in);
	    while (sca.hasNext()) {
	        s.push(sca.nextLine());
	    }
	    try {
	        while (true) System.out.println(s.pop());
	    } catch (Exception e) {
	    	// bad idea
	    }
	    sca.close();
	}
	
}