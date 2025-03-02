package pgms;

public class ReverseCollectionOfWords {
	public static void main(String[] args)
	{
		String str="today is wednessday";
		String[] sp=str.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
			System.out.print(sp[i]+" ");
		}
		
	}

}
