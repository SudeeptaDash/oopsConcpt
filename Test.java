package oopsConcept;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) 
	{
		String s = "Sudeepta";
		char[] chr = s.toCharArray();
		
		HashMap <Character , Integer>  hmap = new HashMap <Character , Integer>();
		
		for(char ch : chr)
		{
			if(hmap.containsKey(ch))
			{
				hmap.put(ch, hmap.get(ch)+1);
			}
			else
			{
				hmap.put(ch, 1);
			}	
		}
		
		System.out.println(hmap);
	}

}
