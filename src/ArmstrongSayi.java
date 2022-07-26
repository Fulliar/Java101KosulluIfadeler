import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int total = 0;
        int remain;

        while ( a>0 ){
            remain = a % 10;
            total += remain;
            a = a /10;

        }
        System.out.println("Sum of the digits of the number is " + total );
    }
}
