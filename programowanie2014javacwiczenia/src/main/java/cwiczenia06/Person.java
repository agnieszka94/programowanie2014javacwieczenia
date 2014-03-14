package cwiczenia06;


import java.util.Collections;

public class Person implements Comparable<Person> {
	
	public Person(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Person t[] = new Person [] {new Person("Kowalski",31),new Person("Buczek",10),new Person("Adamczyk",10),new Person("Kowalski",18)};
         List<Person> Tsorted = Arrays.<Person>asList(t);
         System.out.println(Tsorted);
         Collections.sort(Tsorted);
         System.out.println(Tsorted);

	}

	@Override
	public int compareTo(Person arg0) {
		
		return nazwisko.equals(p.nazwisko)? Integer.compareTo()
	}

}
