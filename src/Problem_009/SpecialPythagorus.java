package Problem_009;
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class SpecialPythagorus {
    public int pythagoreanTriplet(int inputValue) {
        for (int a = 1; a < inputValue; a++) {
            for (int b = a + 1; b < inputValue; b++) {
                int c = inputValue - a - b;
                if (a*a + b*b == c*c) {
                    return a*b*c;
                }
            }
        }
        return 0;
    }
}
