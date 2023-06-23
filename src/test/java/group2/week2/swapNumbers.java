package test.java.group2.week2;

public class swapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("Before swapping");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        a = a + b;
        b = a - b ;
        a = a - b;

        System.out.println("============================================");
        System.out.println("After swapping");
        System.out.println("a= " + a);
        System.out.println("b= " + b);




    }
}
