import java.util.Scanner;


public class PrimeNumbers {

    //Erastotenes Theorem: X is a prime number if it is NOT divisible by any first number >= square root of X

    public int numbers() {

    }


    public boolean isPrime (int x) {
        if (x % Math.sqrt(x) == 0) {
            return true;
        } else {
            return false;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        double x = sc.nextInt();
        int counter = 1000000;




    }

}
