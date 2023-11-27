package Strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the sentence");
     String str= sc.nextLine();
     String[] str2=str.split(" ");
     String ans="";
     for(int i=str2.length-1;i>=0;i--)
     {
    	ans+=str2[i]+" ";
     }
     System.out.println(ans);
     
     
     
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     String rev = "";
//     
//     //Breaking the sentence into words
//     String s[] = str.split(" ");
//     
//     //Adding the words stored in the array to the last
//     for(int i=0;i<s.length;i++){
//         rev = s[i]+" "+rev;
//     }
//     
//     //Printing the reversed sentence
//     System.out.println("Reversed sentence: " + rev);
     
	}

}