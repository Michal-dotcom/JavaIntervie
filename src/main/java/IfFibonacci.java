public class IfFibonacci {
    static int n1=1, n2=1, n3=0;
    static void printFibonacci(int count) {
        if(count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
        }
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1+" " + n2);
        printFibonacci(-2);
    }
}
















    /*public static void main(String[] args) {
        System.out.println("These are the first 10 numbers of a Fibonacci series: ");

        int count = 10;
        int i = 0;
        int firstNum = 0;
        int secondNum = 1;
        int prevSum;


        if (i > count) {

            prevSum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = prevSum;
            System.out.println(prevSum);
            i++;
        }


    }*/
