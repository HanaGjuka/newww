package test.java.group2.week4;

import java.util.Arrays;

public class SameLetter {
    /*
        String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
        */
    public static boolean same(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {
        System.out.println(SameLetter.same("abc", "cba"));
    }
}
