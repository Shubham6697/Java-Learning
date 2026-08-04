package CoreJava.SortingAlgorithm;


/*
Quick Sort:

We will apply two pointer concept for partition and select one pivot/key where all the element which is smaller than pivot
should be placed on left side of an array, and all the element which is greater than pivot should be placed on right side of an array.
After partitioning, the pivot is in its correct position.

Pivot element will be either start or end or mid.
i
{10, 7, 8, 9, 1, 5}
 p               j



 */
public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        printArray(arr);
    }

    static void printArray(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void quickSort(int[] arr, int start, int end)
    {
        if(start < end)
        {
            int pivot = partition(arr, start, end, start);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end, int pivot)
    {
        while(start < end)
        {
            while(start <= end && arr[start] <= arr[pivot])
            {
                start++;
            }

            while(start <= end && arr[end] > arr[pivot])
            {
                end--;
            }

            if(start <= end)
            {
                swap(arr, start, end);
            }
        }
        swap(arr, pivot, end);
        return end;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
