package Problems;

import java.util.Scanner;


public class FindNthHigestNumber
{

    static Scanner s = new Scanner(System.in);


    public static void main(String argp[])
    {
        int arr[] = overRideArray();
        while (true)
        {
            System.out.println(nthHightest(arr));
        }
    }


    public static int nthHightest(int arr[])
    {
        int n = 0;
        do
        {
            System.out.println("Enter the number less than or equal to  " + arr.length);
            n = s.nextInt();
        }
        while (n > arr.length && n > 0);
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < (arr.length - i); j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr[arr.length - n];
    }


    public static int[] overRideArray()
    {
        System.out.println("Enter the element count");
        int numberC = s.nextInt();
        int arr[] = new int[numberC];
        for (int i = 0; i < numberC; i++)
        {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
