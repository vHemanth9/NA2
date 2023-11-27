package Strings;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Begin learning "; 
		String s2="BEGIN LEARNING ";
		System.out.println( "The length of String is : " +s1.length());
		System.out.println("charAt method : " +s1.charAt(9));
		System.out.println("charAt method : " +s1.indexOf('g'));
		System.out.println(s1.trim());
		System.out.println(s1.equals(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.trim()+"java programs");
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		
	}

}
