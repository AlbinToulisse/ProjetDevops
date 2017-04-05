package org.apache.devops.projet;

import java.util.HashSet;
import java.util.Hashtable;

public class Sets {
	static Hashtable<String, HashSet<String>> sets = new Hashtable<String, HashSet<String>>();
	
	static public void sadd(String name, String value)
	{
		HashSet<String> temp;
		if (!sets.containsKey(name))
		{
			temp = new HashSet<String>();
			System.out.println("(integer) 1");
		}
		else
		{
			temp = sets.get(name);
			if (sets.get(name).contains(value)) System.out.println("(integer) 0");
			else System.out.println("(integer) 1");
		}
		temp.add(value);
		sets.put(name, temp);
	}
	
	static public void srem(String name, String value)
	{
		if (sets.contains(name) && sets.get(name).contains(value))
		{
			HashSet<String> temp = sets.get(name);
			temp.remove(value);
			System.out.println("1");
		}
		else System.out.println("0");
	}
	
	static public void sismember(String name, String value)
	{
		if (sets.contains(name) && sets.get(name).contains(value)) System.out.println("(integer) 1");
		else System.out.println("(integer) 0");
	}
	
	static public void smembers(String name)
	{
		if (!sets.contains(name)) System.out.println("(empty list or set)");
		else
		{
			int i = 0;
			for (String s : sets.get(name))
			{
				i++;
				System.out.println(i + ") \"" + s + "\"");
			}
		}
	}
	
	static public void sunion(String name1, String name2)
	{
		int i = 0;
		if (sets.contains(name1))
		{
			for (String s : sets.get(name1))
			{
				i++;
				System.out.println(i + ") \"" + s + "\"");
			}
		}
		if (sets.contains(name2))
		{
			for (String s : sets.get(name2))
			{
				i++;
				System.out.println(i + ") \"" + s + "\"");
			}
		}
		if (i == 0) System.out.println("(empty list or set)");
	}
}
