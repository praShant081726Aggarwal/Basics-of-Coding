import java.util.Scanner;

public class _04HCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbwers"); // prompt to get input of two numbers 
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        while (a%b !=0) {
            int rem = a%b;
            a = b;
            b = rem;
        }

        System.out.println(b);
    }
}