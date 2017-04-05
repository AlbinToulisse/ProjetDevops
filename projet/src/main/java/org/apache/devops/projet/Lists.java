package org.apache.devops.projet;

import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class Lists {
	static Hashtable<String, List<String>> lists = new Hashtable<String, List<String>>();
	
	static public void rpush(String name, String value)
	{
		List<String> temp;
		if (!lists.containsKey(name)) temp = new ArrayList<String>();
		else temp = lists.get(name);
		temp.add(value);
		lists.put(name, temp);
	}
	
	static public void lpush(String name, String value)
	{
		List<String> temp;
		if (!lists.containsKey(name)) temp = new ArrayList<String>();
		else temp = lists.get(name);
		temp.add(0,value);
		lists.put(name, temp);
	}
	
	static public void lrange(String name, int first, int last)
	{
		if (!lists.containsKey(name)) System.out.println("(empty list or set)");
		else
		{
			if (last == -1) last = lists.get(name).size();
			for (int i=first; i<last; i++)
			{
				System.out.println(i-first+1 + ") \"" + lists.get(name).get(i) + "\"");
			}
		}
	}
	
	static public void llen(String name)
	{
		if (!lists.containsKey(name)) System.out.println("(integer) 0");
		else System.out.println("(intger) " + lists.get(name).size());
	}
	
	static public void lpop(String name)
	{
		if (!lists.containsKey(name)) System.out.println("(nil)");
		else
		{
			String temp = lists.get(name).remove(0);
			System.out.println("\"" + temp + "\"");
		}
	}
	
	static public void rpop(String name)
	{
		if (!lists.containsKey(name)) System.out.println("(nil)");
		else
		{
			String temp = lists.get(name).remove(lists.get(name).size()-1);
			System.out.println("\"" + temp + "\"");
		}
	}
}
