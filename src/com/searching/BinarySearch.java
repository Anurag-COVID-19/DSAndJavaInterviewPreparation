package com.searching;

public class BinarySearch
{
    public static int binarySearchTechnique(int[] arr, int target)
    {
        int startIdx = 0, endIdx = arr.length-1;
        return recursiveBinarySearch(arr, startIdx, endIdx, target);
    }

    private static int recursiveBinarySearch(int[] arr, int startIdx, int endIdx, int target)
    {
        if(startIdx <=  endIdx)
        {
            int midIdx = startIdx + (endIdx - startIdx) / 2;
            if(arr[midIdx] == target)
            {
                return midIdx;
            }
            else if(arr[midIdx] < target)
            {
                return recursiveBinarySearch(arr, midIdx+1, endIdx, target);
            }
            else if(arr[midIdx] > target)
            {
                return recursiveBinarySearch(arr, 0, midIdx-1, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{-1,0,3,5,9,12};
        int targetElement = 2; // 9
        int index = binarySearchTechnique(array, targetElement);
        System.out.println("Found at index :: "+ index);
    }

}
