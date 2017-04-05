package org.apache.devops.projet;

import java.util.Hashtable;

public class Integers {
	static Hashtable<String, Integer> integers = new Hashtable<String, Integer>();
	
	static public void set(String name, int value)
	{
		integers.put(name, value);
		System.out.println("OK");
	}
	
	static public void get(String name)
	{
		if (!integers.containsKey(name)) System.out.println("(error) WRONGTYPE Operation against a key holding the wrong kind of value");
		else System.out.println("\"" + integers.get(name) + "\"");
	}
	
	static public void incr(String name)
	{
		incrby(name,1);
	}
	
	static public void incrby(String name, int value)
	{
		if (!integers.containsKey(name)) System.out.println("(error) WRONGTYPE Operation against a key holding the wrong kind of value");
		else
		{
			integers.put(name, integers.get(name)+value);
			System.out.println("(integer) " + integers.get(name));			
		}
	}
}
