package practice;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {-1,0,3,5,9,12};
		int searched=search(arr, 9);
		
		System.out.println("Searched at index:: "+searched);

	}

	public static int search(int[] nums, int target) {

		if (nums.length == 0)
			return -1;

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int midpoint = left + (right - left) / 2;

			if (nums[midpoint] == target) {
				return midpoint;
			} else if (nums[midpoint] > target) {
				right = midpoint - 1;
			} else {
				left = midpoint + 1;
			}

		}

		return -1;

	}

}
