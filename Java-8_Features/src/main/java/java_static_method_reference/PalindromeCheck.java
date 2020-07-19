package java_static_method_reference;
import java.util.*;
import java.util.function.*;
class Palindrome
{
	public static boolean isPalindrome(String s)
	{
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		return s.equals(str.toString());
	}
	
}
public class PalindromeCheck 
{
	public static List<String> checkIfPalindrome(List<String> list,Predicate<String> predicate)
	{
		List<String> ans=new ArrayList<>();
		for(String s:list)
		{
			if(predicate.test(s))
			{
				ans.add(s);
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the length list of strings:");
		n=sc.nextInt();
		List<String> str=new ArrayList<String>();
		System.out.println("enter the list:");
		for(int i=0;i<n;i++)
		{
			str.add(sc.next());
		}
		List<String> result=new ArrayList<String>();
		result=checkIfPalindrome(str,Palindrome::isPalindrome);  //static method reference
		System.out.println("the resultant list of palindromes:");
		for(String i:result)
			System.out.print(i+" ");
		sc.close();
	}

}
