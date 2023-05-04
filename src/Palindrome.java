import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the value:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int rem , rev = 0;
        for (;a!=0; a=a/10){
            rem = a%10;
            rev = rev*10+rem;
        }
        if (rev == n){
            System.out.println("This is a palindrome");
        }
        else {
            System.out.println("This is not a palindrome");
        }


    }
}
