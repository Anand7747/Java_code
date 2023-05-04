import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (; a<=b; a++){
            if (a%2==0){
                sum=sum+a;
            }
        }
        System.out.println("The total even number is"+sum);
    }
}




