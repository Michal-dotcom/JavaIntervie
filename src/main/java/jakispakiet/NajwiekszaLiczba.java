package jakispakiet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NajwiekszaLiczba {

    public static void main(String[] args) {
        int cyfra = 5;
        char cyfra1 = (char) cyfra;

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź liczbę którą chcesz zwiększyć piątką");
        int liczba = sc.nextInt();
        String liczby = Integer.toString(liczba);
        char[] liczbyArr = liczby.toCharArray();
       // int digit = Character.getNumericValue(liczbyArr[0]);
        int n = liczbyArr.length;
        int wynik1[] = new int[liczbyArr.length + 1];
        List a = new ArrayList();


        for (int i = 0; i <= liczbyArr.length; i++) {
            wynik1[i] = cyfra1;
            a.add(wynik1);
        }

        System.out.println(a);

    }

}