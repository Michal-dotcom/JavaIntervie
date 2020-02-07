import java.util.Scanner;

public class PrimeNumOrNot {

    public static void main(String[] args) {
        System.out.println("Input number to check whether it's prime number (if it's divisible only by two numbers then it is prime{by 1 and by itself}): ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 2 != 0) {
            System.out.println("Given number is not prime");
        } else if (i % 2 == 0) {
            System.out.println("Given number is prime");
        }
    }
}
