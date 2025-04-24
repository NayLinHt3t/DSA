package Sorting;

import java.util.Arrays;

//runtime complexity: O(n^2)
//Disadvantage: The larger the data set,the more disadvantage it's going to be,only for small data set
public class SelectionSort {
    public static void main(String[] args){
        int array[] = {1,4,2,8,7,5,9,11,10,55,33,22,44};
        selectionsort(array);
        System.out.println(Arrays.toString(array));
    }
    //method: find the smallest value and place it to it's position
    public static void selectionsort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min =i;
            for(int j=i+1;j<array.length -1;j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
        }
    }
}
