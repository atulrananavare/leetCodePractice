package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotateleft {

	public static void main(String[] args) {
	

	}
	
	public static int[] rotLeft(List<Integer> a, int d) {
       int[] nums=toIntArray(a);
       d %=nums.length;
       reverse(nums,0,nums.length-1);
        reverse(nums,0,d-1);
         reverse(nums,d,nums.length-1);
     
         ArrayToListConversion(nums);
         
         return nums;
   }
   
	 public static void reverse(int[] a, int start, int end){
	        
	        while(start<end){
	            Integer temp=a[start];
	            a[start]=a[end];
	            a[end]=temp;
	            start--;
	            end++;
	            
	        }
	        
	    }
   
   public static <T> List<T> ArrayToListConversion(int[] nums)   
   {   
   //invoking the asList() method and passing the array to be converted  
   List<int[]> list = Arrays.asList(nums);   
   //returns the list  
   return (List<T>) list;   
   }
   
   public static int[] toIntArray(List<Integer> list){
	   int[] ret = new int[list.size()];
	   for(int i = 0;i < ret.length;i++)
	     ret[i] = list.get(i);
	   return ret;
	 }
}


