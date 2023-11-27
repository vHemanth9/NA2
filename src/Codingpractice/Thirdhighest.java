package Codingpractice;

import java.util.Scanner;

public class Thirdhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no.of elements to be printed");
	   Scanner sc=new Scanner(System.in);
	   int temp=0;
	   int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
       } 
       
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n;j++)
    	   {
    		   if(a[i]<a[j])
    		   {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    		   
    	   }
       }
       
       for(int i=0;i<n;i++)
       {
    	   System.out.println("After swapping:"+ a[i]);
    	   
       }
       
       System.out.println("Second Largest element is "+a[1]);  
       System.out.println("Second Smallest element is "+a[n-2]);
	}

}
