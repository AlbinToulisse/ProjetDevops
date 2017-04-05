package org.apache.devops.projet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class Sorted_sets {
	static Hashtable<String, Hashtable<String, Integer>> sets = new Hashtable<String, Hashtable<String, Integer>>();

	static public void zadd(String name, Integer value, String key)
	{
		Hashtable<String, Integer> temp;
		if (!sets.containsKey(name))
		{
			temp = new Hashtable<String, Integer>();
			System.out.println("(integer) 1");
		}
		else
		{
			temp = sets.get(name);
			if (sets.get(name).contains(key)) System.out.println("(integer) 0");
			else System.out.println("(integer) 1");
		}
		temp.put(key, value);
		sets.put(name, temp);
	}
	
	static public void zrange(String name, int first, int last)
	{
		if (!sets.containsKey(name)) System.out.println("(empty list or set)");
		else
		{
			ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(sets.get(name).entrySet());
			Collections.sort(list, new Comparator<Map.Entry<?, Integer>>(){
	
			public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}});
			
			int  i = 0;
			for (Map.Entry<String, Integer> m : list)
			{
				i++;
				System.out.println(i + ") \"" + m.getKey() + "\"");
			}
		}
	}
}
