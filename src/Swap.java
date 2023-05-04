//WAP in java to switch the values between two variables.
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int swap;
        swap = a;
        a = b;
        b = swap;
        System.out.println(a);
        System.out.println(b);


    }
}
