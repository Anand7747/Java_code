import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while (n!=0){
            count=count+1;
            n=n/10;
        }
        System.out.println("Total digit"+count);
    }
}
