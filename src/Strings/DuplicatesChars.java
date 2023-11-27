package Strings;

import java.util.Scanner;

public class DuplicatesChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner sc =new Scanner(System.in);
//      System.out.println("Enter the string");
      String str="this is java";
      int cnt=0;
      char[] oup=str.toCharArray();
//      for(int i=0;i<oup.length;i++)
//      {
//    	 int  count=1;
//    	 
//    	  for(int j=i+1;j<oup.length;j++)
//    	  {
//    		  if(oup[i]==oup[j]&&oup[i]!=' ')
//        	  {
//    			  count++;
//        		  oup[j]='0';
//        	  }
//    	  }
//    	  
//    	  if(count>1&&oup[i]!='0')
//    		  System.out.println(oup[i]);
//      }
      
      
      for(int i=0;i<str.length();i++)
      {
    	  for(int j=i+1;j<str.length();j++)
    	  {
    		  if(oup[i]==oup[j])
    		  {
    			  System.out.print(oup[j]+ " ");
    			  cnt++;
    			  break;
    		  }
    		    
    		  
    	  }
      }
      
      }

}
