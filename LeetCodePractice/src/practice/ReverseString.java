package practice;

public class ReverseString {

	public static void main(String[] args) {
		char[] str1 = { 'h', 'e', 'l', 'l', 'o' };
		reverseString4(str1);
		
		/*
		 * StringBuffer sb= new StringBuffer(str); System.out.println(sb.reverse());
		 */

		// reverseStringM2(str);

		/*
		 * String reversed = reverseStringRecursive(str); System.out.println(reversed);
		 */

		// reverseString(str);

		String[] str = { "h", "e", "l", "l", "o" };

		char[] temp = new char[str.length];
		for (int i = 0; i < str.length; i++) {
			temp = str[i].toCharArray();
		}
	//	System.out.println(temp);

		
	

	}

	public static void reverseStringM2(String str) {

		char[] chars = str.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.println(chars[i]);

		}

	}

	public static String reverseStringRecursive(String str) {
		if (str.isEmpty())
			return str;

		return reverseStringRecursive(str.substring(1)) + str.charAt(0);
	}

	public static void reverseString(char[] s) {

		for (int i = s.length - 1; i >= 0; i--) {
			System.out.println(s[i]);

		}
	}

	public static void reverseString1(char[] s) {
		int left = 0, right = s.length - 1;
		while (left < right) {
			char tmp = s[left];
			s[left++] = s[right];
			s[right--] = tmp;

		}
		//System.out.println(s);
	}

	public static void reverseString4(char[] s) {
		int a_pointer = 0;
		int b_pointer = s.length - 1;
		
		while (a_pointer <= b_pointer) {
			char temp = s[a_pointer];
			s[a_pointer] = s[b_pointer];
			s[b_pointer] = temp;
			
			a_pointer++;
			b_pointer--;
			
		}
		System.out.println(s);
		
	}
}
