package java_streams_1;
import java.util.*;
public class AverageOfList 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the length of list:");
		n=sc.nextInt();
		List<Integer> array=new ArrayList<Integer>();
		System.out.println("Enter the list:");
		for(int i=0;i<n;i++)
		{
			array.add(sc.nextInt());
		}
		OptionalDouble avg=array.stream()
				                .mapToInt(i->i)
		                        .average();
		double result=avg.orElse(1234);
		System.out.println("Average of the list given is:"+result);
		sc.close();
		
	}

}
