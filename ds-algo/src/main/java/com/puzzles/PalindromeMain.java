package com.puzzles;

/**
 * Program to check whether a number is Palindrome or not
 * <p>
 * Def: A palindromic number is same when its letters are reversed. Like 16461, abcba
 *
 * @author Srinath.Rayabarapu
 */
public class PalindromeMain {

    public static void main(String[] args) {
		
/*		Scanner s = new Scanner(System.in);
		System.out.print("enter a number \n");
		int num = s.nextInt();

		//int n = 1233321;
		checkPalindrome(num);*/

        String str = "A man, a plan, a canal: Panama";
        int i = checkPalindromeNasty(str);
        System.out.println(i);
    }

    /**
     * arithmetic way
     *
     * @param n
     */
    private static void checkPalindrome(int n) {
        System.out.print("Good way : ");
        //n%10 - will give last number
        //n/10 - will give whole number without last number
        int result = 0;
        int temp = n;

        while (n > 0) {
            int b = n % 10;
            n = n / 10;
            result = (result * 10) + b;
        }
        if (result == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    /**
     * converting to a string and comparing chars - more of work around!
     *
     * @param str
     */
    private static int checkPalindromeNasty(String str) {

        String reverse = "";
        String original = "";
        for (char c : str.toCharArray()) {
            // upper case and lower case alphabets condition
            if ((64 < c && c < 91) || (96 < c && c < 123)) {
                reverse = c + reverse;
                original = original + c;
            }
        }
        if (original.toLowerCase().equals(reverse.toLowerCase())) {
            return str.length();
        } else {
            return -1;
        }
    }
}