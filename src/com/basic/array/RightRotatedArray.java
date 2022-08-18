package com.basic.array;

import java.util.Arrays;

/**
 *   Leetcode problem 189:
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RightRotatedArray
{
    public static void main(String[] args) {
        int[]  array = new int[]{1,2,3,4,5,6,7};
        int numberOfRotations = 3;
        rightRotateArray(array, numberOfRotations);
    }

    private static void rightRotateArray(int[] array, int numberOfRotations)
    {
        int size= array.length;
        int[] rotatedArray = new int[size];
        for(int i = 0; i < size; i++)
        {
            rotatedArray[i] = array[i];
        }
        for(int i = 0; i < size; i++)
        {
            int idx = (numberOfRotations+ i)% size;
            array[idx] = rotatedArray[i];
        }
        Arrays.stream(array).forEach(System.out::print);
    }
}
