package pgms;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "welcome";
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (st.indexOf(ch) == -1) {
				st = st + ch;
			}
		}
		System.out.println(st);
	}

}
