import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class primtest {
    public static void main(String[] args) {
    int number = 10007*100003;
    // Check if the number is prime
    int i = 2;
    boolean isPrime = true;
    while (i <= Math.floor(Math.sqrt(number))) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
        i++;
    }
    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}
}


