package pgms;

public class GetDigitsOnly {

	public static void main(String[] args) {
		String str="$ja!va$1&2st%ar";
		String getNum=str.replaceAll("[^0-9]", "");
		System.out.println(getNum);

	}

}
