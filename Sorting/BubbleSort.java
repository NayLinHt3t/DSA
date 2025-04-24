package Sorting;

import java.util.Arrays;

//runtime complexity: O(n^2)
//Disadvantage: The larger the data set,the more disadvantage it's going to be,only for small data set
public class BubbleSort {
    public static void main(String[] args){
        int array[] = {1,4,2,8,7,5,9,11,10,55,33,22,44};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
