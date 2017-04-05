package org.apache.devops.projet;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Sorted_sets.zadd("test", 1, "bob");
    	Sorted_sets.zadd("test", 0, "alan");
    	Sorted_sets.zadd("test", 2, "franc");
    	Sorted_sets.zadd("test", 1, "benoit");
    	Sorted_sets.zrange("test", 0, -1);
    	
		/*Scanner reader = new Scanner(System.in);
		String n;
		String[] command = {"test"};
    	while (!command[0].equals("quit"))
    	{
        	n = reader.nextLine();
        	command = n.split(" ");
        	for (int i=0; i<command.length; i++)
        	{
            	System.out.print(command[i] + " ");        		
        	}
        	System.out.println("");
    	}
    	reader.close();*/
    }
}
