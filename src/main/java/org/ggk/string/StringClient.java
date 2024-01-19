package org.ggk.string;

public class StringClient {

    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        String palindromeString = "baab";
        System.out.println("The string " + palindromeString +
                (palindrome.isPalindrome(palindromeString) ? " is a palindrome" : " is not a palindrome"));
    }
}
