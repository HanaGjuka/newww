package test.java.group2.week2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Divisible by 15");
        for(int i = 1; i <= N; i++){
            if(i % 15 == 0){
                System.out.println(i + " ");
            }
        }

        System.out.println("Divisible by 5: ");
        for(int i = 1; i <= N; i++){
            if(i % 5 == 0 && i % 15 !=0){
                System.out.println(i + "");
            }
        }

        System.out.println("Divisible by 3: ");
        for(int i = 1; i <= N; i++){
            if(i % 3 ==0 && i % 15 !=0){
                System.out.println(i + "");
            }
        }


    }
}
