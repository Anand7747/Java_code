import java.util.Scanner;
public class TableCode {
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        System.out.println("Enter the number:-");
        for (int i = 1; i <=10; i++)
        {
            sum=i*n;
            System.out.printf("%d*%d=%d\n",n,i,sum);
        }
    }
}
