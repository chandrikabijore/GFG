package com.chandrikabijore;

public class MaxMinFinder
{
    public static void main(String[] args)
    {
        int[] A = {2, 6, 4, 8, 10, 3};
        int N = A.length;

        System.out.println("Minimum element is : " + setMin(A, N));
        System.out.println("Maximum element is : " + setMax(A, N));
        System.out.println("Sum of Maximum and Minimum Elements is : " + (setMin(A, N) + setMax(A, N)));
    }

    public static int setMin(int[] A, int N)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++)
        {
            if (A[i] < min)
            {
                min = A[i];
            }
        }
        return min;
    }

    public static int setMax(int[] A, int N)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            if (A[i] > max)
            {
                max = A[i];
            }
        }
        return max;
     }
}
