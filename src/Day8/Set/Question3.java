package Day8.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question3 {
/*Question 3.1
public static void main(String[] args) {
	Set<Integer>s=new HashSet<>();
	s.add(105);s.add(205);s.add(305);
	s.add(405);s.add(505);s.add(605);
	s.add(705);s.add(805);s.add(905);
	System.out.println(s);
	for (Integer ret : s) {
		System.out.println(ret);
	}
}*/
	
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<>();
		s.add(10);s.add(20);s.add(30);
		s.add(40);s.add(50);s.add(60);s.add(70);
		s.add(80);s.add(90);s.add(10);s.add(20);
		System.out.println(s);
		for (Integer ret : s) {
			System.out.println(ret);
		}
	}
	
	
	
	
}
	