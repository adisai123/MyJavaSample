package Problems;

import java.util.Scanner;


public class LinearSearch
{

    private static int i;


    public static void main(String[] args)
    {
        int index = findElement();
        if (index != -1)
        {
            System.out.println("element fount at " + index);
        }
        else
        {
            System.out.println("element not fount at ");
        }
    }


    static int findElement()
    {
        int arr[] = FindNthHigestNumber.overRideArray();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int key = s.nextInt();
        for (int i = 0; i < arr.length; i++)
        {
            if (key == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
