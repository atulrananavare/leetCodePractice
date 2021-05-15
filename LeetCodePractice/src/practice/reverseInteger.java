package practice;

public class reverseInteger {

	public static void main(String[] args) {

		int number = 123;

		System.out.println(reverse(number));

		isPalindrome(123454321);
	}

	public static int reverse(int num) {
		int rev = 0;// num=123

		while (num != 0) {
			int pop = num % 10; // pop=3
			num = num / 10; // 12

			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;

			rev = rev * 10 + pop;// 0*10+3=3
		}

		return rev;// 3

	}

	public static boolean isPalindrome(int x) {

		if(x==0) {
			return true;
		}
		
		if(x<0 || x%10==0) {
			return false;
		}
		
		int rev = 0;

		while (x > rev) {

			int pop = x % 10;
			x = x / 10;
			rev = rev * 10 + pop;

		}

		if (x == rev || x==rev/10) {
			System.out.println("number is palindrome");
			return true;
		} else {
			System.out.println("number is not palindrome");
			return false;
		}

	}

}
