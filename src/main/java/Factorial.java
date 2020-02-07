import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for it's factorial: ");

        int factorial = sc.nextInt();
        int count = factorial;
        int i = 1;
        while (i <= count) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of " + count + " is : " + factorial);
    }
}
