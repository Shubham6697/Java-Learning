package CoreJava.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] arr = {133,3242,1323,21,123,42,315,56,108,23,56,2,6,89,877,9,8,6,4,34};
        int n = arr.length;

        for(int i = 0;i < n;i++)
        {
            int minIdx = i;
            for(int j = i+1;j < n;j++)
            {
                if(arr[j] < arr[minIdx])
                {
                    minIdx = j;
                }
            }

            swap(arr, minIdx, i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
