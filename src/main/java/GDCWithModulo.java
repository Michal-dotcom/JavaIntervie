import java.util.Scanner;

public class GDCWithModulo {

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
        while (true) {
            if (n1 % n2 != 0) {
                int modulo = n1 % n2;
                n1 = n2;
                n2 = modulo;
                System.out.println(modulo);
            } else if (n1 % n2 == 0) {
                System.out.println("1");
            }

        }

    }


}
