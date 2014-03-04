package cwiczenia03;

public class CodeLetter {
	char a;
	public CodeLetter(char letter) {
		a = letter;
	}

	public String code(String in) {
		StringBuilder sBuild = new StringBuilder();
		@SuppressWarnings("unused")
		int count=0;
		for(int i=0; i<in.length(); i++) {
			if (a == in.charAt(i)){
				while (in.charAt(i)== a){
					i++;
					count++;
				}
				sBuild.append(a);
				sBuild.append(a);
			}
			if (a != in.charAt(i)){
				
			}
				
			
			}
			
		return sBuild.toString();
	}

	public String decode(String in) {
		return null;
		
	}

	public static void main(String[] args) {
		CodeLetter c1 = new CodeLetter('a'), c2 = new CodeLetter('b');
		String s = "aaaaaaaaabbbbcccbbbcbbcbbcbcbaaaabbabbababa";
		String w = "a^5bbc^3b^3";
		System.out.println(c1.code(s));
		System.out.println(c2.code(s));
		System.out.println(c2.code(c1.code(s)));
		System.out.println(c1.decode(w));
		System.out.println(c2.decode(w));
		System.out.println(c2.code(c2.decode(w)));
	}
}