package cwiczenia04;

public class Controlled {
    public static int howManySoFar() {
    	return a;
    }
    
    public static int a;
    
    public Controlled () {
    	a++;
    }
    public static void main (String[] array){
    	for (a=0; a<1000; a++){
    		Controlled a = new Controlled ();
    	}
    	System.out.println();
    }
}
