package cwiczenia01;

public class Fibbs {
    public static int recursiveFibb(int i) { 
	return i<2? i : recursiveFibb(i-1)+recursiveFibb(i-2);
}
    public static int nonrecursiveFibb(int i) { 
	int f = 1;
	int f2 = 1;
	int temp = 1;
 
	for(int n=2; n<i; n++) {
	    temp = f + f2;
	    f = f2;
	    f2 = temp;
	}
	return temp;
}
public static void main(String[] args) {
		for(int i=0; i<10; i++)
  		System.out.println("rec: " + recursiveFibb(i) + "    nonrec: " + nonrecursiveFibb(i) );
	}
}

