import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Enter the input:-");
        Scanner sc = new Scanner(System.in);
            char signal = sc.nextLine().charAt(0);
            
            switch (signal) {
                case 'r':
                case 'R':
                    System.out.println("Stop");
                    break;
                case 'y':
                case 'Y':
                    System.out.println("Ready to go");
                    break;
                case 'g':
                case 'G':
                    System.out.println("Go");
                    break;
                default:
                    System.out.println("Please enter the valid input");

            }
        }
        
    }

