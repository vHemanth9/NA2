package Strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      Set<String> duplicates = duplicateWords(str); 
      System.out.println("input : " + str); 
      System.out.println("output : " + duplicates);
      
	}

	private static Set<String> duplicateWords(String str) {
		// TODO Auto-generated method stub
		if(str==null||str.isEmpty())
		{
			return Collections.emptySet();
		}
		
		Set<String> duplicates = new HashSet<>();
		String[] words = str.split("\\s+"); 
		Set<String> set = new HashSet<>(); 
		for(String word : words)
		{ 
			if(!set.add(word))
		   { 
			duplicates.add(word); 
			}
		} 
		return duplicates;

	}

}
