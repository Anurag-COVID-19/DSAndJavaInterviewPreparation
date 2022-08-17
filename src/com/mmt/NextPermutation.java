package com.mmt;

public class NextPermutation {

    /**
     * Write a program that takes input a permutation and returns the next permutation under dictionary ordering.
     * For example if the input array is [2,3,5,4] your function should return [2,4,3,5]
     * @param args
     */
    public void getNextPermutation(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < arr[i+1])
            {
                //swapTheValues(arr);
            }
        }
    }

  /*  private int[] swapTheValues(int[] initial)
    {

    }
*/
    public static void main(String args[])
    {
        int[] arr = new int[]{2,3,5,4};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.getNextPermutation(arr);
    }
}
