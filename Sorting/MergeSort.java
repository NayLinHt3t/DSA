package Sorting;

import java.util.Arrays;

public class MergeSort {
    //divide and conquer algorithm
    //run time complexity: o(n log n)
    //uses more space than other sorting algorithm
    public static void main(String[] args){
        int data[] = {1,4,2,8,7,5,9,11,10,55,33,22,44};
        mergeSort(data,0,data.length -1);
        System.out.println(Arrays.toString(data));
    }
    public static void mergeSort(int[]data,int low,int high){
        if (( high - low) > 1) {
            int mid = (low + high) / 2;
            mergeSort(data, low, mid);
            mergeSort(data, mid + 1, high);
            merge(data, low, mid, high);
        } else {                                    //base case  (high - low) <= 1
            if (low < high) {                       //high-low == 1
                if (data[low] > data[high]) {
                    // Swap two elements
                    swap(data,low,high);
                }
                // else: already in order
            }
            // else: only one element, do nothing
        }
    }
    public static void swap(int []arr,int low,int high){
        int temp = arr[low];
         arr[low] = arr[high];
         arr[high] = temp;
    }
    public static void merge(int data[],int low,int mid,int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        // Merge the two halves into temp[]
        while (i <= mid && j <= high) {
            if (data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = data[i++];
        }

        // Copy remaining elements from right half
        while (j <= high) {
            temp[k++] = data[j++];
        }

        // Copy sorted temp array back to original data
        for (int t = 0; t < temp.length; t++) {
            data[low + t] = temp[t];
        }
    }
}
