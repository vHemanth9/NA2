package Codingpractice;

import java.util.Scanner;

public class FrequencyOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String");
     String str=sc.nextLine();
    
     char ch[]=str.toCharArray();
     for(int i=0;i<str.length();i++)
     { 
    	 int count=1;
    	 for(int j=i+1;j<str.length()-1;j++)
    	 {
    		 if(ch[j]!='x')
    		 {
    		 if(ch[i]==ch[j])
    		 {
    			 count++;
    			 ch[j]='x';
    			 
    		 }
    		 }
    	 }
    	 if(ch[i]!='x') {
    	 System.out.println(ch[i] +" : "+count+" ");
    	 }
     }
     
     
	}

}
