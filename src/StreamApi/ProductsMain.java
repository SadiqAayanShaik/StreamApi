package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Products.Products;

public class ProductsMain {
	public static void main(String[] args) {
		
		List<Products> list=new ArrayList<Products>();
		 list.add((new Products(1,"Hp",23000)));
		 list.add((new Products(2,"Hp",23300)));
		 list.add((new Products(3,"Dell",23300)));
		 
		 System.out.println(list);
		 
		List<Products>list2= list.stream().map(p->{
		if(p.getName()=="Hp")
		{
			 p.setCost(p.getCost()+1000);
		}
		return p;
		}).collect(Collectors.toList());
		
		
		System.out.println("\n\tIncrement in Hp:1000\n");
		System.out.println(list2);
		}
		 
		 
	}

