package practice;

public class IsPalindrome {

	public static void main(String[] args) {
		isPalindrome("A man, a plan, a canal: Panama");

	}
	
	public static boolean isPalindrome(String s) {
        String rev="";
  
        int length=s.length();
        
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        
        if(s.equals(rev)){
        	System.out.println("String is Palindrome");
            return true;
        }
        else{
        	System.out.println("String is not Palindrome");
            return false;
        }
        
    }

}
