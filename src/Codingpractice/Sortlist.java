package Codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sortlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(2,4,0,1,56,23,4);
//		System.out.println(list.stream().sorted().collect(Collectors.toList()));
//		
		
     List<Integer> list=new ArrayList<>();
     list.add(2);
     list.add(4);
     list.add(0);
     list.add(1);
     list.add(56);
     list.add(23);
     list.add(4);
     
     System.out.println(list);
     
     Collections.sort(list);
     
     System.out.println(list);
	}

}
