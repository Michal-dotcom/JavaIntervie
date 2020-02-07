// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Fibonacci {

    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        int previousNum;
        int sum;
        System.out.println("First 10 numbers of ficonacci series: ");
        int counter = 10000;

        for (int i = 0; i < counter; i++) {
            System.out.println(firstNum);
            previousNum = firstNum + secondNum; // Order of operations is important here
            firstNum = secondNum;
            secondNum = previousNum;
        }
    }
}
