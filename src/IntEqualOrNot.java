import java.util.Scanner;
 class IntEqualOrNot {
     public static void main(String[] args) {
         int m,n;
         System.out.printf("Enter the value of m and n");
         Scanner sc=new Scanner(System.in);
         m= sc.nextInt();
         n= sc.nextInt();
         if(m==n){
             System.out.println("m and n are equal");
         }
         else{
             System.out.println("m and n are not equal");
         }
     }
}
