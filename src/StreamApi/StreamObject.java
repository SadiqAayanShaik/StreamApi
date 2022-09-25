package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		Stream<int[]> stream=Stream.of(new int[] {12,13,14,15,156});
		
		IntStream stream1=Arrays.stream(new int[] {1,23,12,24});
		
		Stream<String> string=Stream.of("Sadiq","Aayan");
		
		 stream1.forEach(e->{
			 System.out.println(e);
		 });
		 
		 string.forEach(e->{
			 System.out.println(e);
		 });
		 
		 List<Integer>list2 =new ArrayList<Integer>();
			list2.add(12);
			list2.add(13);
			list2.add(14);
			list2.add(10);
			
			list2.stream().forEach(e->{
				System.out.print(e+" ");
			});
			System.out.println();
			
			list2.stream().filter(i->i%2==0).forEach(System.out::println);
			
			System.out.println("Squares: ");
			list2.stream().map(i->i*i).forEach(System.out::println);
			
			
			list2.stream().sorted().forEach(System.out::println);
			
			
			int min=list2.stream().min((x,y)->x.compareTo(y)).get();
			System.out.println("Min:"+min);
			
			
			int max=list2.stream().max((x,y)->x.compareTo(y)).get();
			System.out.println("Max Number:"+max);
	}

	
}
