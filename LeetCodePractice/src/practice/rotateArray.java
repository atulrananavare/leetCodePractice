package practice;

public class rotateArray {

	public static void main(String[] args) {
		rotateArray arr = new rotateArray();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		arr.rotate(nums, 3);

	}

	// {1,2,3,4,5,6,7}
	// {7,2,3,4,5,6,7}
	public void rotate(int[] nums, int k) {

		k %= nums.length;// 3
		// System.out.println(k);
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];// previous=7 k=3
			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];// temp=1
				nums[j] = previous;// nums[0]=7
				previous = temp;// previous=1
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public void rotate2(int[] nums, int k) {
		 int[] a = new int[nums.length];
		 
		    for (int i = 0; i < nums.length; i++) {
		      a[(i + k) % nums.length] = nums[i];
		    }
		    for (int i = 0; i < nums.length; i++) {
		      nums[i] = a[i];
		    }
		  }
	

}
