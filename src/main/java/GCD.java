import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            n1 = n1;
        } else if (n2 > n1) {
            int temp = n2;
            n2 = n1;
            n1 = n2;
        }


        int x = n1 - n2;
        while (x < n2) {

        }

    }
}
