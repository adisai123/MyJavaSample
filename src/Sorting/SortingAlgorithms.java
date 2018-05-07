package Sorting;

public class SortingAlgorithms
{

    /**
     * Comparing with neighboring elements and swap if required. On every i iteration biggest number from unsorted list will be moved to the last
     * position (thats why (arr.lenth -i)).
     * 
     * @param arr
     */
    public static void bubbleSort(int arr[])
    {
        int count = 0;
        boolean flag = true;
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < (arr.length - i); j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    SortingUtility.swap(arr, j + 1, j);
                    flag = false;
                }
                count++;
            }
            if (flag)
                break;
        }
        SortingUtility.showPerformance(count, arr.length, "BubbleSort",
                "Comparing with neighboring elements and swap if required. On every i iteration biggest number from unsorted list will be moved to the last position (thats why (arr.lenth -i)).");
    }


    /**
     * Select lowest element from the right side of list for the current position.
     * 
     * @param arr
     */
    public static void selectionSort(int[] arr)
    {
        int index;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            index = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[index] > arr[j])
                {
                    index = j;
                }
                count++;
            }
            if (i != index)
            {
                SortingUtility.swap(arr, index, i);
            }
        }
        SortingUtility.showPerformance(count, arr.length, "SelectionSort",
                "Select lowest element from the right side of list for the current position.");
    }


    /**
     * Compare adjacent even - odd positions (Two for loops starts with both 0 and 1 and and increments with 2 steps.)
     * 
     * @param arr
     */
    public static void evenOdd(int[] arr)
    {
        int count = 0;
        boolean flag;
        do
        {
            flag = false;
            for (int i = 0; i < (arr.length - 1); i = i + 2)
            {
                if (arr[i] > arr[i + 1])
                {
                    SortingUtility.swap(arr, i + 1, i);
                    flag = true;
                }
                count++;
            }
            for (int i = 1; i < (arr.length - 1); i = i + 2)
            {
                if (arr[i] > arr[i + 1])
                {
                    SortingUtility.swap(arr, i + 1, i);
                    flag = true;
                }
                count++;
            }
        }
        while (flag);
        SortingUtility.showPerformance(count, arr.length, "evenOddSort",
                "Compare adjacent even - odd positions (Two for loops starts with both 0 and 1 and and increments with 2 steps.)");
    }


    /**
     * Left hand side elements are sorted by single steps.(left to right sorting)(Its like cards arrangement)
     * 
     * @param arr
     */
    public static void insertionSort(int arr[])
    {
        int count = 0;
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[i])
                {
                    SortingUtility.swap(arr, j, i);
                }
                count++;
            }
        }
        SortingUtility.showPerformance(count, arr.length, "InsertionSort",
                "Left hand side elements are sorted by single steps.(left to right sorting)(Its like cards arrangement)");
    }


    /**
     * The algorithm differs from a bubble sort in that it sorts in both directions on each pass through the list
     * 
     * @param arr
     */
    public static void bidirectionBubbleSort(int arr[])
    {
        int count = 0;
        boolean flag;
        int j = 0;
        do
        {
            flag = false;
            for (int i = 0; i < (arr.length - 2) - j; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    SortingUtility.swap(arr, i, i + 1);
                    flag = true;
                }
                count++;
            }
            for (int i = (arr.length - 2) - j; i > 0; i--)
            {
                if (arr[i] > arr[i + 1])
                {
                    SortingUtility.swap(arr, i, i + 1);
                    flag = true;
                }
                count++;
            }
            j++;
        }
        while (flag);
        SortingUtility.showPerformance(count, arr.length, "bidirectionBubbleSort",
                "The algorithm differs from a bubble sort in that it sorts in both directions on each pass through the list");
    }


    /**
     * 
     * no nested loop required , starts with 0 position if value of current position is greater than previous position , position incremented else
     * element exchanged and position decremented
     * 
     * 
     * 
     * @param arr
     */
    public static void gnomeSort(int arr[])
    {
        int count = 0;
        int pos = 1;
        while (pos < arr.length)
        {
            if (pos == 0 || arr[pos] >= arr[pos - 1])
            {
                pos++;
            }
            else
            {
                SortingUtility.swap(arr, pos, pos - 1);
                pos--;
            }
            count++;
        }
        SortingUtility.showPerformance(count, arr.length, "GnomeSort",
                "no nested loop required , starts with 0 position if value of current position is greater than previous position , position incremented else element exchanged and position decremented");
    }

    static int count = 0;


    /**
     * given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x)
     * before x, and put all greater elements (greater than x) after x.we start from the leftmost element and keep track of index of smaller (or equal
     * to) elements as i. While traversing, if we find a smaller element, we swap current element with arr[i]
     * 
     * @param arr
     */
    public static void quickSort(int arr[])
    {
        sort(arr, 0, arr.length - 1);
        SortingUtility.showPerformance(count, arr.length, "quickSort",
                "given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x)"
                        + "      before x, and put all greater elements (greater than x) after x.we start from the leftmost element and keep track of index of smaller (or equal"
                        + "      to) elements as i. While traversing, if we find a smaller element, we swap current element with arr[i]");
    }


    private static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int index = partition(arr, low, high);
            sort(arr, low, index - 1);
            sort(arr, index + 1, high);
        }
    }


    // 1 -100 20 2 30 1000 29 10 340 3 65 34 23 422 110 1
    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                SortingUtility.swap(arr, i, j);
            }
            count++;
        }
        SortingUtility.swap(arr, high, (i + 1));
        return i + 1;
    }
}
