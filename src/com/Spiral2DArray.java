package com;

import java.util.ArrayList;
import java.util.List;

public class Spiral2DArray
{
    public static List<Integer> spiralProblem(int[][] arr)
    {
        List<Integer> result = new ArrayList<>();
        int rowBegin = 0, columnBegin = 0;
        int rowEnd = arr.length-1, columnEnd = arr[0].length-1;

        while(rowBegin <= rowEnd && columnBegin <= columnEnd)
        {
            for(int i = columnBegin; i <= columnEnd; i++)
            {
                result.add(arr[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin; i <= rowEnd; i++)
            {
                result.add(arr[i][columnEnd]);
            }
            columnEnd--;

            if(rowBegin <=  rowEnd)
            {
                for(int i = columnEnd; i >= columnBegin; i--)
                {
                    result.add(arr[rowEnd][i]);
                }
            }
            rowEnd--;
            if (columnBegin <= columnEnd)
            {
                for(int i = rowEnd; i >= rowBegin; i--)
                {
                    result.add(arr[i][columnBegin]);
                }
            }
            columnBegin++;
        }
        return result;
    }

    public static void main(String args[])
    {
        int[][] arr = new int[][]{ {22, 23, 24, 25, 5}, {10, 11, 12, 13, 6}, { 14, 15, 16, 17, 8}, {18, 19, 20, 21, 9} };
        for(int i = 0; i < arr.length; i++)
        {
            for(int  j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(Spiral2DArray.spiralProblem(arr));
    }
}
