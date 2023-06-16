package test.java.group2.week4;

public class RemoveDuplicates {
    /*
  String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
  */
    public static String removeDup(String str){
        String result = ""; // "abc"
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str.

            char each = str.charAt(i); // each character of the String str

            if (!result.contains(""+each)) { // if the string result does not contain the character of the string str yet
                result += each; // then we will add the character to string result
            } // if the character does not contain yet in the string, then we will add to the new string
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicates.removeDup("aaabbbcccddd"));
    }
}
