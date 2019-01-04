package Problem_010;

/*
Summation of primes
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

import java.util.ArrayList;
import java.util.List;

public class SumPrimes {
    public double sumPrime(int input) {
        List<Integer> primes = new ArrayList<>();
        primes = findPrimes(input, primes);
        double sum = 0;
        for (int i = 0; i < primes.size(); i++) {
            sum += primes.get(i);
        }
        return sum;
    }

    private List<Integer> findPrimes(int input, List<Integer> prime) {
        prime.add(2);
        for (int i = 3; i < input; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        return prime;
    }

    private boolean isPrime(int input) {
        if (input == 0 || input == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
