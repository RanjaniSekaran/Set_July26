package Day8.Set;

import java.util.*;

public class SetCreation {
	public static void main(String[] args) {
		Set<Integer> s= new HashSet<>(); //- Random
		//Set<Integer> s = new LinkedHashSet<>(); //- Insertion Order
		//Set <Integer> s = new TreeSet<>(); //-ascending order
		s.add(20);s.add(20);s.add(30);
		s.add(40);s.add(70);s.add(60);
		s.add(70);s.add(80);s.add(90);
		s.add(10);s.add(100);
		System.out.println(s);
	}

}
