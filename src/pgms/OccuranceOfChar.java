package pgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfChar {
	public static void main(String[] args)
	{
		String str="today is wednessday";
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				map.put(ch, count+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
			
		
	}

}
