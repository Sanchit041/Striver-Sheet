package Sorting;
import java.util.*;
public class Selectionsort {
    // 1
    static int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = Integer.MAX_VALUE;
        int ind = -1;
        for(int j=i;j<arr.length;j++)
        {
            if(min>arr[j])
            {
                min =arr[j];
                ind = j;
            }
        }
        return ind;
	}
	
	static void selectionSort(int arr[], int n)
	{
	    //code here
        for(int i=0;i<n;i++)
        {
            int ind = select(arr, i);
             if(arr[i] != arr[ind])
             {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;     
            }
        }

	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"->");
        }
    }
}
