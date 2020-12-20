package com.dsalgo.strings;

/**
 * program to reverse a string
 *
 * #siemens
 *
 * @author Srinath.Rayabarapu
 */
public class StringReverseMain {
	
	public static void main(String[] v) {
		
		String str = "abcdefg";

		aproach1(str);
		System.out.println("");
		aproach2(str);
		String reverse = aproachRecursive(str, str.length(), "");
		System.out.println(reverse);
	}

	/**
	 * reverse string recursively
	 *
	 * @param str
	 * @param length
	 * @param temp
	 * @return
	 */
	private static String aproachRecursive(String str, int length, String temp) {
		if(length > 0){
			temp = temp + str.charAt(length-1);
			return aproachRecursive(str, length-1, temp);
		}
		return temp;
	}

	/**
	 * taking an extra space
	 *
	 * @param str
	 */
	private static void aproach2(String str) {
		String reversed = "";
		for(Character character : str.toCharArray()){
			reversed = character + reversed;
		}
		System.out.println(reversed);
	}

	/**
	 * without extra space
	 * @param str
	 */
	private static void aproach1(String str) {
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
	}
}