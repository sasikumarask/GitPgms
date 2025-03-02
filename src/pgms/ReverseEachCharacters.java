package pgms;

public class ReverseEachCharacters {
	
	public static void main(String[] args)
	{
		String str="hello";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
