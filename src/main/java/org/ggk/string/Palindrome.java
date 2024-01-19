package org.ggk.string;

public class Palindrome {

    public boolean isPalindrome(String s) {
        return isPalindromeTwoPointer(s);
    }

    private boolean isPalindromeTwoPointer(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        for (; i < j && arr[i] == arr[j]; i++, j--) ;
        return (i == j || Math.abs(j - i) == 1);
    }
}
