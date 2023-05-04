import java.util.Scanner;
public class EvenOdd_btw_a_z {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(;a<=b;a++){
            int x=0;
            for(int i=2;i<a;i++){
                if(a%i==0){
                    x=1;
                }
            }
            if (x==0){
                System.out.println("prime number"+a);
            }
            else{
                System.out.println("not prime"+a);
            }
        }

    }
}
