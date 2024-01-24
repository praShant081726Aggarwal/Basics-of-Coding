import java.util.Scanner;

public class _02isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : "); // Promt to take input
        int n = sc.nextInt(); // to take input
        sc.close();
        if (n < 2) {
            System.out.println("Not Prime"); // smallest prime number is 2, so num less than 2 can't be prime
        }else{
            int i = 2;
            boolean isPrime=true; // let's consider n is prime
            while (i * i <= n) { // if a number is composite it must be divisible by a number equal or less than it's square root
                if (n % i == 0) { // is it's divisible by i than n is not prime
                    isPrime = false; 
                    System.out.println("Not Prime");
                    break; // since we found n is not prime we terminate the loop.
                }
                i++;
            }
            if(isPrime){ // if isPrime is found to be true, then the n is prime
                System.out.println("Prime");
            }
        }

    }
}