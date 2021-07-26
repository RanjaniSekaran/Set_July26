package Day8.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question41 {
	/* Question 4.1
	 Set <Integer> s= new HashSet<>();
		List <Integer> l=new ArrayList<>();
		l.add(10);l.add(20);l.add(30);l.add(90);
		l.add(10);l.add(10);l.add(40);l.add(50);
		List<Integer> l1=new ArrayList<>();
		l1.add(30);l1.add(40);l1.add(50);l1.add(60);
		l1.add(80);
		l.retainAll(l1);
		System.out.println(l);
		o/p:[30, 40, 50]*/
	/*Question -4.2
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		s.add(10);s.add(20);s.add(30);s.add(90);
		s.add(10);s.add(10);s.add(40);s.add(50);
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(10);s1.add(20);s1.add(60);s1.add(50);
		s1.add(40);s1.add(70);s1.add(80);s1.add(90);
		boolean a = s1.retainAll(s);
		System.out.println(a);System.out.println(s1);
	}
	output-true
	[10, 20, 50, 40, 90]
	}*/
	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<>();
		s.add(10);s.add(20);s.add(30);s.add(40);
		s.add(50);s.add(60);s.add(70);s.add(80);
		Set<Integer> s1=new TreeSet<>();
		s1.add(100);s1.add(200);s1.add(300);s1.add(400);
		s1.add(500);s1.add(600);s1.add(700);s1.add(8000);
		boolean a = s1.retainAll(s);
		System.out.println(a);System.out.println(s1);
	}
		
	}


