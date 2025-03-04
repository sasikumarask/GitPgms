package pgms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOrCountNumberOfWordsInString {
	public static void main(String[] args)
	{
		String str="a day is a day of day";
		String[] sp=str.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<sp.length;i++)
		{
			if(map.containsKey(sp[i]))
			{
				int count=map.get(sp[i]);
				map.put(sp[i], count+1);
			}
			else
			{
				map.put(sp[i], 1);
			}
		}
		System.out.println(map);
	}

}
