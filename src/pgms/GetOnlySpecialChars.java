package pgms;

public class GetOnlySpecialChars {
	public static void main(String[] args) {
		String str = "$ja!va$1&2st%ar";
		String specialChars = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(specialChars);
	}
}
