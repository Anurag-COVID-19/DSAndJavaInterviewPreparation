package com.basic.array;

import java.util.Scanner;

/**
 * Objective: Able to perform 2-D arrays basic ops in java
 * Input: 5 x 5 matrix
 * Output:
 *      1. Read, Write{display in output}
 *      2. Traverse inside the columns by making a row constant or vice-versa
 *
 */
public class MultiDimensionalArrayOperation
{
    public static Scanner sc = new Scanner(System.in);

    static public int[][] input(int n, int m, int[][] arr)
    {
        System.out.println("Input the 2-D array");
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static public void display(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    /**
     * Input:
     *       0 0 0 0 1
     *       0 1 0 0 0
     *       0 1 0 0 1
     *       0 1 0 0 0
     *       1 0 0 0 1
     * Output:
     *      Return: pairs - [5, 4] & [5, 3]
     * @param arr
     * @param n
     * @param m
     */

    static public void keepingRowConstantColumnTraverse(int[][] arr, int n, int m)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] == 0)
                {
                    for(int k = j+1; k < m; k++)
                    {
                        if(arr[i][k] != 0)
                        {
                            break;
                        }
                        else
                        {
                            j++;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter row size : ");
        int n = sc.nextInt();
        System.out.print("Enter column size : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("Row & Column : "+ n + "x"+ m);
        System.out.println();
        arr = MultiDimensionalArrayOperation.input(n, m, arr);
        MultiDimensionalArrayOperation.display(arr);
        keepingRowConstantColumnTraverse(arr, n, m);
    }
}
