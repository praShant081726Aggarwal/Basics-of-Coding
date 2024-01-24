// Sum of first N natural numbers
import java.util.Scanner;

public class _01Sum_N {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : "); // to prompt user to enter a number
        int n = sc.nextInt(); // to take input 
        sc.close();
        int sum  = n*(n+1)/2; // formula for sum of first N natural numbers
        System.out.println("Sum of first N natural numbers is : " + sum);
        System.out.println("Sum of first N natural numbers is : " + n*(n+1)/2); // more efficient way

    }
}