package Problem_006;

/*
Sum square difference
Problem 6

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    public int sumSquareDiff(int range) {
        return squareOfSums(range) - sumOfSquares(range);
    }

    // first find the sum of squares
    private int sumOfSquares(int range) {
        int product = 0;
        for (int i = 1; i <= range; i++) {
            product = product + (int) Math.pow(i, 2);
        }
        return product;
    }

    // second find the square of sums
    private int squareOfSums(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum = sum + i;
        }
        return (int) Math.pow(sum, 2);
    }
}
