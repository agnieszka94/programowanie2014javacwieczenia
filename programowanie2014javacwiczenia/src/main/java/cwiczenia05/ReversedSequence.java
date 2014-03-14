package cwiczenia05;

import java.util.Random;

public class ReversedSequence implements CharSequence  {

	CharSequence string;
	public ReversedSequence (CharSequence string){
		this.string = string;
	}
	
	@Override
	public char charAt(int arg0) {
		return string.charAt(arg0);
	}
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public CharSequence subSequence(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Random r = new Random();
        ReversedSequence s =
            new ReversedSequence("Napisz klase implementujaca interfejs z java.lang.CharSequence");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println("");
        int start = r.nextInt(s.length() - 1);
        int end = r.nextInt(s.length() - 1 - start) + start;
        System.out.println(s.subSequence(start, end));
        System.out.println(s);
        s = new ReversedSequence(s);
        System.out.println(s);	}
}
