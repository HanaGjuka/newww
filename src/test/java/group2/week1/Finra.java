package test.java.group2.week1;

public class Finra {

    public static void main(String[] args) {

        finra();

    }

    public static void finra(){

        String result = "";

        for(int i = 1; i <= 30; i++){

            result += (i % 3 == 0)? " FIN " :(i % 5 == 0)? " RA " :(i % 3 == 0 && i % 5 == 0 )? " FINRA " : i + " ";

        }
        System.out.println(result);

    }




}
