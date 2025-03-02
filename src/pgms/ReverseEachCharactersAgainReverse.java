package pgms;

public class ReverseEachCharactersAgainReverse {
	public static void main(String[] args)
	{
		String str="today is wednessday";
		String s1="";
		String s2="";
		String[] sp=str.split(" ");
		for(String input:sp)
		{
			String rev1="";
			for(int i=input.length()-1;i>=0;i--)
			{
				rev1=rev1+input.charAt(i);
			}
			s1=s1+rev1+" ";
		}
		System.out.println(s1+"\n");
		String[] split = s1.split(" ");
		for(String out:split)
		{
			String rev2="";
			for(int i=out.length()-1;i>=0;i--)
			{
				rev2=rev2+out.charAt(i);
			}
			s2=s2+rev2+" ";
		}
		System.out.println(s2);
	}

}
