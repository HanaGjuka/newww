package week2;


import java.util.Scanner;

public class divisibleNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = input.nextInt();

        String by15 ="";
        String by5 = "";
        String by3 = "";

        for (int i = 1; i <= number; i++) {
            if (i%15 == 0){
                by15 += i+ " ";
            } else if (i%5 == 0) {
                by5 += i + " ";
            } else if (i%3 == 0) {
                by3 += i+ " ";
            }
        }

        System.out.print( "Divisible By 15: "  + by15);
        System.out.println();
        System.out.print( "Divisible By 5: "  + by5);
        System.out.println();
        System.out.print( "Divisible By 3: "  + by3);




        input.close();







    }
}
