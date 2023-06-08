package test.java.group2.week1;

public class DivideWithoutOperator {


    public static void main(String[] args) {

        DivideWithout(50,9);
    }

    public static void DivideWithout(int num1, int num2){

        if(num2 == 0){
            System.err.println("Invalid number");
        }


        int count = 0;

        while(num1 >= num2){

            num1 -= num2;
            count++;
        }

        System.out.println(count);


    }


}
