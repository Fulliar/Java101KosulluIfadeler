import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sum;
        int firstNumb = 0;
        int secondNumb = 1;

        System.out.println("Eleman sayısını giriniz");
        int Count = input.nextInt();

        for(int i = 1; i < Count; i++){
            Sum = firstNumb + secondNumb;
            System.out.println(firstNumb + " + " + secondNumb + " = " + Sum);
            firstNumb=secondNumb;
            secondNumb=Sum;
            System.out.println("\n");
        }
    }
}
