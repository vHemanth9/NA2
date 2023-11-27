package Codingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	private int id;
	
	private String Pname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public Product(int id, String pname) {
		super();
		this.id = id;
		Pname = pname;
	}

	@Override
	public String toString() {
		return "\n"+"Product [id=" + id + ", Pname=" + Pname + "]";
	}
	
}

public class Productsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Product> list=new ArrayList<>();
     list.add(new Product(1,"watch"));
     list.add(new Product(2,"phone"));
     list.add(new Product(3,"laptop"));
     list.add(new Product(4,"heater"));
     
//     System.out.println(list);
//     
     System.out.println("After sorting  with product name");
     
    // Collections.sort(list,Comparator.comparing(Product::getPname));
 list.stream().sorted((o1,o2)->o1.getPname().compareTo(o2.getPname()))
 .forEach(n->System.out.println(n.getId()+" "+n.getPname()));

     
     
     
	}

}
