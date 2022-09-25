package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class streamapi {
	public static void main(String[] args) {
		
		List<Integer>list1=List.of(1,2,3,4,5,6,7,0);
		 
		List<Integer>list2 =new ArrayList<Integer>();
		list2.add(12);
		list2.add(13);
		list2.add(14);
		
		List<Integer>list3=Arrays.asList(12,34,23);
		 
		List<Integer> EvenList=new ArrayList<Integer>();
		
		for(Integer i:list1)
		{
			if(i%2==0)
			{
				EvenList.add(i);
			}
		}
		System.out.println("Even Number Without Stream: "+EvenList);
		
		List<Integer>streamEvenList= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	  
		System.out.println("Even Number With using Streams:"+streamEvenList);
		
		 
		  
	}

}
