package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SortingApplication
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = SortingUtility.provideInput();
        printMenu();
        String choice;
        do
        {
            System.out.println("\nEnter the choice:");
            choice = bf.readLine();
            switch (choice)
            {
                case "0" :
                    break;
                case "1" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.bubbleSort(arr);
                    print("OutPut", arr);
                    break;
                case "2" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.selectionSort(arr);
                    print("OutPut", arr);
                    break;
                case "3" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.evenOdd(arr);
                    print("OutPut", arr);
                    break;
                case "4" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.insertionSort(arr);
                    print("OutPut", arr);
                    break;
                case "5" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.bidirectionBubbleSort(arr);
                    print("OutPut", arr);
                    break;
                case "6" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.gnomeSort(arr);
                    print("OutPut", arr);
                    break;
                case "7" :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
                    SortingAlgorithms.quickSort(arr);
                    print("OutPut", arr);
                    break;
                default :
                    arr = SortingUtility.provideInput();
                    print("InPut", arr);
            }
        }
        while (!choice.equals("0"));
    }


    private static void printMenu()
    {
        System.out.println("** Welcome to the Array Sorting Application **");
        System.out.println("Menu");
        System.out.println("1      ->   Bubble-Sort");
        System.out.println("2      ->   Selection-Sort");
        System.out.println("3      ->   EvenOdd-Sort");
        System.out.println("4      ->   Insertion-Sort");
        System.out.println("5      ->   bidirectionBubble-Sort");
        System.out.println("6      ->   gnome-Sort");
        System.out.println("7      ->   Quick-Sort");
        System.out.println("AnyKey ->   Print-Inputs");
        System.out.println("0      ->   Exit");
    }


    private static void print(String type, int arr[])
    {
        System.out.println();
        System.out.println("[" + type + "]");
        SortingUtility.printArr(arr);
        System.out.println();
        System.out.println("[end]");
    }


    /**
     * This method clear the current screen. Currently its not working. Need to dig more for this method.
     * 
     * @throws IOException
     * 
     * 
     */
    public static void clearScreen() throws IOException
    {
        if (System.getProperty("os.name").contains("Windows"))
        {
            @SuppressWarnings("unused")
            Process p = Runtime.getRuntime().exec("cmd /c cls");
        }
    }
}
