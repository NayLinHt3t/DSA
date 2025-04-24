package Sorting;

import java.util.Arrays;

//applies divide and conquer algorithm
public class QuickSort {
    public static void main(String[] args){
        int array[] = {1,4,2,8,7,5,9,11,10,55,33,22,44};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[]array,int low,int high){
        int split = partition(array,low,high);
        if(low<split){
            quickSort(array,low,split);
        }if(high>split+1){
            quickSort(array,split+1,high);
        }

    }
    public static int partition(int[] array,int low,int high){
        int pivot = array[low];
        int i = low -1;
        int j = high + 1;
        while(true){
            do{
                i++;
            }while(array[i] < pivot);
            do{
                j--;
            }while (array[j] > pivot);
            if(i< j){
                swap(array,i,j);
            }else{
                return j;
            }
        }
    }
    public static void swap(int[] array,int i,int j){
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
    }
}
