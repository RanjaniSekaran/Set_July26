package Day8.Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SampleSet {
	
		public static void main(String[] args) {
			Map<Integer,String> m = new TreeMap<>();
			m.put(10, "java");m.put(20, "Sql");m.put(50,"oops");
			m.put(40, "Oracle");m.put(60, "DB");m.put(30,"selenium");
			m.put(10, "psql");m.put(50, "Hadoop");m.put(40," ");
			System.out.println(m);
				System.out.println(m.values());
			System.out.println(m.keySet());
	}
}
