package Codingpractice;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--)
		{
		System.out.print(ch[i]);
		}
	
         
	}

}
