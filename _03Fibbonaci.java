import java.util.Scanner;

public class _03Fibbonaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : "); // prompt to take input from user
        int n = sc.nextInt(); // to take input
        sc.close();
        // Fibonnaci numbers are --> 1,1,2,3,5,8,13,21.... basically the next number is sum of nth and (n-1)th term
        int a=0;
        int sum=1;
        for(int i=2; i<=n; i++){
           int temp = a;
            a=sum;
            sum+=temp;
        }
        System.out.println(sum);

    }
}