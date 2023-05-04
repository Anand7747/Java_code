import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for ( int i =1; i<=a; i++){
            sum = sum+i;
        }
        System.out.println("Sum="+sum);
    }
}
