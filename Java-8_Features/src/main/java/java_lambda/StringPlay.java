package java_lambda;
import java.util.*;
import java.util.stream.*;
public class StringPlay 
{
	public static List<String> stringStartingWithA(List<String> list)
	{
		List<String> result=list.stream()
				                 .filter(str -> str.charAt(0)=='a' && str.length()==3)
				                 .collect(Collectors.toList());//Stream
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of list of strings:");
		int n=sc.nextInt();
		List<String> list=new ArrayList<String>();
		System.out.println("Enter the list of strings:");
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		List<String> result=new ArrayList<String>();
		result=stringStartingWithA(list);
		System.out.println("The strings starting with 'a' and length 3 are:");
		for(String i:result)
		{
			System.out.print(i+" ");
		}
		sc.close();
		
		
	}
	

}
