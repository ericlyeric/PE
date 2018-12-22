package Problem_005;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;

/*
Smallest Multiple
Problem 5

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class SmallestMultiple {
    public int smallestMultiple(int upperLimit){
        int number = 1;
        for (int i = 1; i <= upperLimit; i++) {
            if (number % i == 0) {
                continue;
            }
            else {
                number++;
                i = 1;
            }
        }
        return number;
    }
}
