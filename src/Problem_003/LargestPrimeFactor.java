package Problem_003;

/*
Largest prime factor
Problem 3

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {
    public long largePrime(long number) {
        long maxPrime = 1;

        while (number % 2 == 0) {
            maxPrime = 2;
            number = number / 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
        }

        if (number > 2) {
            maxPrime = number;
        }

        return maxPrime;
    }
}
