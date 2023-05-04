import java.util.Scanner;
public class OddMultiples {
    public static void main(String[] args) {
        System.out.println("Enter the positive integer:-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int i = 1;
        while (num<=a){
            if (num%2!=0){
                i = i*num;
            }
            num = num+1;
        }
        System.out.println("Multiply odds =" +i);
    }
}
