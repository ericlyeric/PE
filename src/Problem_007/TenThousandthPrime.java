package Problem_007;

/*
10001st prime
Problem 7

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
public class TenThousandthPrime {
    // count the prime numbers
    public int primeCount(int primeNumber) {
        int count = 0;
        int i = 0;

        while (count < primeNumber) {
            i++;
            if (isPrime(i)) {
                count++;
            }
        }
        return i;
    }

    // determine if number is prime
    private boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
