package cwiczenia06;

public class Plus {
	public String toString(){ return "+"; }
	}

	class ProducePlusOrStar{
	  public static Plus producePlus(){ return new Plus();}
	  public static Plus produceStar(){
		  
		  
		return null; 
		  
	  }
	}

	public class Anon {
	 public static void main(String [] args){
	  System.out.println(""+ ProducePlusOrStar.producePlus() + " " + ProducePlusOrStar.produceStar());
	
	 }
	}

	
	
