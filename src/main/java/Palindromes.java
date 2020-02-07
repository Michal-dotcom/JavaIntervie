import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        System.out.println("Input a string to reverse");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String reverse = "";

        for (int n = string.length() - 1; n >= 0; n--) {
            reverse = reverse + string.charAt(n);

        }
        if (reverse.equalsIgnoreCase(string)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        System.out.println(reverse);
    }
}








    /*public static void main(String[] args) {
        String a,b = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your word:");
        a = s.nextLine();
        int n = a.length();

        for(int i = n-1; i >=0; i--) {
           b = b + a.charAt(i);
            if(a.equalsIgnoreCase(b)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    }*/