import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int maxNum = num1;
        if (num2 > maxNum) {
            maxNum = num2;
        }
        System.out.println("The maximum number is: " + maxNum);
    }
}
