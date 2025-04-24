package Sorting;

import java.util.Arrays;
//runtime complexity: O(n^2)
//best case is O(n)
//Disadvantage: The larger the data set,the more disadvantage it's going to be,only for small data set
public class InsertionSort {
    public static void main(String[] args){
        int array[] = {1,4,2,8,7,5,9,11,10,55,33,22,44};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] arrays){
        for(int i=1;i<arrays.length;i++){
            int temp = arrays[i];
            int j = i-1;
            while(j >= 0 && arrays[j] > temp){
                arrays[j+ 1] = arrays[j];
                j--;
            }
            arrays[j+1] = temp;
        }
    }
}
