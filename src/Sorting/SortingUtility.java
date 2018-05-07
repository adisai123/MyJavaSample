package Sorting;

import java.util.Arrays;


public class SortingUtility
{

    /**
     * Swaps two array elements without using any temporary variables
     * 
     * @param arr
     * @param index
     * @param i
     */
    static void swap(int[] arr, int index, int i)
    {
        if (arr[index] != arr[i])
        {
            arr[index] = arr[index] + arr[i];
            arr[i] = arr[index] - arr[i];
            arr[index] = arr[index] - arr[i];
        }
    }


    /**
     * print array elements with the help of lambda expressions.
     * 
     * @param arr
     */
    static void printArr(int[] arr)
    {
        Arrays.stream(arr).forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }


    /**
     * Total iterations required while sorting the data provided.
     * 
     * @param iterationCount
     * @param elementSize
     */
    static void showPerformance(int iterationCount, int elementSize, String alegorithmName, String shortinfo)
    {
        System.out.println("\n[" + alegorithmName + "]");
        System.out.println(shortinfo);
        System.out.println("    Total Iteration count:" + iterationCount);
        System.out.println("    Given Elements count:" + elementSize);
        System.out.println(" [ end ]");
    }


    /**
     * Provide static inputs for sorting.
     * 
     * @return
     */
    static int[] provideInput()
    {
        int arr[] = {1000, 110, 20, 2, 30, 1, 29, 10, 340, 3, 65, 34, 23, 422, -100, 1};
        return arr;
    }
}
