package practice;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		//Arrays.sort(nums);
		
		//removeDuplicates(nums);
		
		//removeDuplicates2(nums);
		
		//hashSetDuplicate(nums);
		
		m1(nums);
		
	}

	public static int removeDuplicates(int[] nums) {
		int j=0;
		int[] temp= new int[nums.length];		
		
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				temp[j]=nums[i];
				j++;
			}
			temp[j]=nums[nums.length-1];
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println("count is: "+temp.length);
		return temp.length;
	}
	
	
	public static int removeDuplicates2(int[] a) {
		int j=0;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
			
		}
		a[j]=a[a.length-1];
		for (int i = 0; i < j+1; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println(a.length);
		return a.length;
	}
	
	public static void hashSetDuplicate(int[] a) {
		
		HashSet<Integer> set= new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		System.out.println("size is: "+ set.size());
		
	}
	
	
	public static int m1(int[] nums) {
		 int j=0;
			
			
	        if(nums.length==0) return 0;
			
			for(int i=1;i<nums.length;i++) {
				if(nums[i]!=nums[j]) {
	                j++;
					nums[j]=nums[i];
					System.out.println(nums[j]);
				}
				
			}
			
			
			
			return j+1;

	}
	


}
