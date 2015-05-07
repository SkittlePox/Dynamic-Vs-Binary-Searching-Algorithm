package com.company;

/**
 * Created by Benjamin on 5/6/15.
 */
public class binsearch {
    binsearch() {
    }

    int length;

    public double search(int[] nums) {
        int upper = nums.length - 1, lower = 0, searchpt, count;
        double avg = 0;
        length = nums.length;
        System.out.println("Length is " + length);
        System.out.println("Upper is " + upper);
        System.out.println("Lower is " + lower);
        for (int x = 0; x < nums.length; x++) {
            System.out.println("Testing element " + x);
            count = 0;
            lower = 0;
            upper = nums.length - 1;

            while (upper - lower >= 1) {
                count++;
                if ((upper - lower) % 2 == 0) {
                    searchpt = (upper - lower) / 2 + lower;
                } else {
                    searchpt = ((upper - lower + 1) / 2) + lower;
                }

                System.out.println("Searchpt is now " + searchpt);

                if (searchpt + 1 == nums[x]) {
                    System.out.println("Got it with " + count + " tries!");
                    break;
                } else if (searchpt + 1 < nums[x]) {
                    lower = searchpt + 1;
                    System.out.println("Element " + x + " is higher than searchpt");
                } else {
                    upper = searchpt - 1;
                    System.out.println("Element " + x + " is lower than searchpt");
                }
                System.out.println("Upper is " + upper);
                System.out.println("Lower is " + lower);
                if (upper - lower <= 1) System.out.println("Got it with " + count + " tries!");
            }
            avg += count;
        }
        avg /= length;
        return avg;
    }
}