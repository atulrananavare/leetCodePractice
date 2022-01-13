package practice;

public class LuckyIntegerInArray {

	public static void main(String[] args) {
		int[] arr= {2,2,3,3};
		
		System.out.println(findLucky(arr));

	}

	public static int findLucky(int[] arr) {

		int[] cnt = new int[5];

		for (int num : arr) {
			System.out.println("Num is"+num);
			cnt[num]++;
			System.out.println("cnt[num]++:"+cnt[num]);
		}

		for (int i = cnt.length - 1; i > 0; i--) {
			if (cnt[i] == i) {
				return i;
			}

		}

		return -1;

	}
}
