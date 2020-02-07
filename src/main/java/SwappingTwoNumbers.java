import java.util.Scanner;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int x = sc.nextInt();
        System.out.println("Input second number: ");
        int y = sc.nextInt();

        System.out.println("Before swapping: " + x + " " + y);

        int temp = y;
        y = x;
        x = temp;

        System.out.println("\nAfter swapping: " + x + " " + y);
    }

}
