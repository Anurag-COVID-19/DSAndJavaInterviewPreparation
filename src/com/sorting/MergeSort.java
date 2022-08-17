package com.sorting;

import java.util.Arrays;

public class MergeSort
{
    /*public static int[] mergeSort(int[] array, int[] aux, int lIdx, int uIdx)
    {
        if(lIdx == uIdx)
        {

        }
        int midIdx = (lIdx + uIdx)/2;
        mergeSort(array, aux, lIdx, midIdx);
        mergeSort(array, aux, midIdx+1, uIdx);

        return mergeProcedure(array, aux,  lIdx, midIdx, uIdx);
    }

    private static int[] mergeProcedure(int[] array, int[] aux, int lIdx, int midIdx, int uIdx)
    {
        int k = lIdx, i = lIdx, j = midIdx+1;
        while (i <= midIdx && j <= uIdx)
        {
            if(aux[i] <= aux[j])
            {
                array[k] = aux[i];
                i++;
            }
            else
            {
                array[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= midIdx)
        {
            array[k] = aux[i];
            i++;
            k++;
        }
        while (j <= uIdx)
        {
            array[k] = aux[j];
            j++;
            k++;
        }
        return array;
    }*/
    /*{
        int[] sortedArray = new int[uIdx-lIdx+1];
        int k = 0, q = midIdx+1, p = lIdx;
        for(int i = lIdx; i <= uIdx; i++)
        {
            if(p > midIdx)
            {
                sortedArray[k++] = array[q++];
            }
            else if(q > uIdx)
            {
                sortedArray[k++] = array[p++];
            }
            else if(array[p] < array[q])
            {
                sortedArray[k++] = array[p++];
            }
            else
            {
                sortedArray[k++] = array[q++];
            }
        }
        for (int j= 0; j < k; j++)
        {
            array[lIdx++] = sortedArray[p];
        }
    }*/
    /*{
        int[] leftHalf = new int[midIdx-lIdx];
        int[] rightHalf = new int[uIdx-midIdx];
        for(int i = 1; i < leftHalf.length-1; i++)
        {
            leftHalf[i] = array[lIdx+i-1];
        }
        for(int j = 1; j < rightHalf.length-1; j++)
        {
            rightHalf[j] = array[midIdx+j];
        }
        int i = 1, j = 1;
        for(int k = 1; k < array.length; k++)
        {
            if(leftHalf[i] <= rightHalf[j])
            {
                array[k] = leftHalf[i];
                i = i+1;
            }
            else
            {
                array[k] = rightHalf[j];
                j = j+1;
            }
        }
    }*/

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*
    A utility to sort the array of size n using merge sort technique
     */
    public int[] mergeSort(int[] array)
    {
        if(array.length <= 1 )
        {
            return array;
        }
        int midIndex = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, midIndex);
        int[] rightHalf = Arrays.copyOfRange(array, midIndex, array.length);
        return mergeSortTechnique(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    public int[] mergeSortTechnique(int[] leftHalf, int[] rightHalf)
    {
        int[] sortedArray = new int[leftHalf.length+ rightHalf.length];
        int i = 0, j = 0, k = 0;
        while (i < leftHalf.length && j < rightHalf.length)
        {
            if(leftHalf[i] <= rightHalf[j])
            {
                sortedArray[k++] = leftHalf[i++];
            }
            else
            {
                sortedArray[k++] = rightHalf[j++];
            }
        }
        while(i < leftHalf.length)
        {
            sortedArray[k++] = leftHalf[i++];
        }
        while (j < rightHalf.length)
        {
            sortedArray[k++] = rightHalf[j++];
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] arrayToSort = new int[]{8,5,2,9,5,6,3};
        MergeSort mergeSort = new MergeSort();
        System.out.println("Given Array");
        printArray(arrayToSort);
        int[] auxilaryArray = arrayToSort.clone();
        auxilaryArray = mergeSort.mergeSort(arrayToSort);
        System.out.println("Resultant Array");
        printArray(auxilaryArray);
    }
}
