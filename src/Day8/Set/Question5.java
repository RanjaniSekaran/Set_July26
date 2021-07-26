package Day8.Set;

import java.util.*;
public class Question5 {
	/*Question 5.1
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		List <Integer> l=new ArrayList<>();
		l.add(10);l.add(20);l.add(30);l.add(90);
		l.add(10);l.add(10);l.add(40);l.add(50);
		boolean a = s.addAll(l);
		System.out.println(s);
		Set<Integer> s1=new TreeSet<>();
		s1.add(30);s1.add(40);s1.add(50);s1.add(60);
		s1.add(80);
		boolean b = s1.removeAll(s);
		System.out.println(a);System.out.println(s1);
		output-[50, 20, 40, 10, 90, 30]
true
[60, 80]
	}*/
	/*Question 5.2
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<>();
		Set <Integer> s1 = new LinkedHashSet<>();
		List<Integer> l=new LinkedList<>();
		List<Integer> l1=new LinkedList<>();
		l.add(10);l.add(20);l.add(30);l.add(90);
		l.add(10);l.add(10);l.add(40);l.add(50);
		l1.add(10);l1.add(20);l1.add(60);l1.add(50);
		l1.add(40);l1.add(70);l1.add(80);l1.add(90);
		s.addAll(l);s1.addAll(l1);
		System.out.println(s);System.out.println(s1);
		s.removeAll(s1);
		System.out.println(s);
		output-[10, 20, 30, 90, 40, 50]
[10, 20, 60, 50, 40, 70, 80, 90]
[30]
	}*/
public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<>();
		s.add(10);s.add(20);s.add(30);s.add(40);
		s.add(50);s.add(60);s.add(70);s.add(80);
		Set<Integer> s1=new TreeSet<>();
		s1.add(100);s1.add(200);s1.add(300);s1.add(400);
		s1.add(500);s1.add(600);s1.add(700);s1.add(8000);
		boolean a = s1.removeAll(s);
		System.out.println(a);System.out.println(s1);
	}
		

}
	
