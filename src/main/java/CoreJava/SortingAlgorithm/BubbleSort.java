package CoreJava.SortingAlgorithm;


import java.util.Arrays;

/*
In One iteration
    Larger value goes at the end and so on
 */
public class BubbleSort
{    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] arr = {221,32,124,13,1234,234,23,1,23,2,4,5,4};
        int n = arr.length;



        for(int i = 0;i < n;i++)
        {
            boolean isSorted = true;

            for(int j = 1;j < n-i;j++)
            {
                if(arr[j-1] > arr[j])
                {
                    swap(arr, j-1, j);
                    isSorted = false;
                }
            }

            if(isSorted)
            {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
