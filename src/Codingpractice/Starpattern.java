package Codingpractice;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<n;i++)
//		{
//		for(int j=n-i;j>1;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
//		for (int i=0; i<n; i++) //outer loop for number of rows(n)
//        { 
//        for (int j=n-i; j>1; j--) //inner loop for spaces
//            { 
//                System.out.print(" "); //print space
//            }  
//            for (int j=0; j<=i; j++ ) //inner loop for number of columns
//            { 
//                System.out.print("* "); //print star
//            } 
//  
//            System.out.println(); //ending line after each row
//        } 
		
	}

}
