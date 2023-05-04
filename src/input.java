import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter the input:-");
        int a;
        float b;
        double c;
        long d;
        char e;
        Scanner sc;
        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextFloat();
        c = sc.nextDouble();
        d = sc.nextLong();
        sc.nextLine();
        e = sc.nextLine().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
