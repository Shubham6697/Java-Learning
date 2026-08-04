package CoreJava.SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] arr = {23,23,2323,89,54,9843,24,7,79432,82,43,5465,6775,34,56,32,1,1,1,2,4,6,78,4};
        int n = arr.length;

        for(int i = 1;i < n;i++)
        {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j])
            {
                swap(arr, j, j-1);
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
