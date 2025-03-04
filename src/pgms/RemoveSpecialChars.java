package pgms;

public class RemoveSpecialChars {
	public static void main(String[] args)
	{
		String str="$ja!va$1&2st%ar";
		String removeSpecialCh=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(removeSpecialCh);
	}

}
