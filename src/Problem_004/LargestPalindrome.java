package Problem_004;

/*
Largest palindrome product
Problem 4

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class LargestPalindrome {
    public int biggestPalindrome(int digits){
        int startNumber = (int) Math.pow(10, (digits)) - 1;
        int endNumber = (int) Math.pow(10, (digits)) / 10;
        int largestProduct = 0;
        for (int i = startNumber; i >= endNumber; i--) {
            for (int j = startNumber; j >= endNumber; j--) {
                int product = i * j;
                int revProduct = reverseProduct(product);
                if (revProduct == product && revProduct > largestProduct) {
                    largestProduct = revProduct;
                }
            }
        }
        return largestProduct;
    }

    public int reverseProduct(int product) {
        int remainder;
        int reversedProduct = 0;
        while (product != 0) {
            remainder = product % 10;
            reversedProduct = reversedProduct * 10 + remainder;
            product = product / 10;
        }
        return reversedProduct;
    }
}