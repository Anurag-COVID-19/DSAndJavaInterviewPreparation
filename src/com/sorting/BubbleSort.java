package com.sorting;

public class BubbleSort
{

    public static void main(String[] args) {
        int[] array = new int[]{8,5,2,9,5,6,3};
        boolean isSorted = true;
        int temp =0;
        while(isSorted)
        {
            isSorted = false;
            for(int i = 0; i < array.length-1; i++)
            {
                if(array[i] > array[i+1])
                {
                    isSorted = true;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
