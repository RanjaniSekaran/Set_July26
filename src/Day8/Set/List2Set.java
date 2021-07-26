package Day8.Set;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List2Set {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		/* question 2.1
		l.add(10);l.add(20);l.add(30);
		l.add(90);l.add(10);l.add(10);
		l.add(40);l.add(50);
		System.out.println(l);
		Set <Integer>s=new LinkedHashSet<>();
		boolean z = s.addAll(l);
		System.out.println(s);
		o/p:
			[10, 20, 30, 90, 10, 10, 40, 50]
					[10, 20, 30, 90, 40, 50]*/
		l.add(105);l.add(205);l.add(305);
		l.add(405);l.add(505);l.add(605);
		l.add(705);l.add(805);l.add(905);
		l.add(505);l.add(605);
		System.out.println(l);
		Set <Integer> s= new LinkedHashSet<>();
		System.out.println(s.addAll(l));
		System.out.println(s);
		
		
	}

}
