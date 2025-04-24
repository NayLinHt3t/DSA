package Searching;


//runtime complexity : O(n)
//Disadvantage: slow for large data set
//Advantage: fast for small to medium data set
//           Does not need to sort

//searching a value in an array by looking at the element one by one
public class LinearSearch {
    public static void main(String [] args){
        int[] data = { 2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27,
                28, 33, 37 };
        int value = 22;
        int position = search(value,data);
        if(position != -1){
            System.out.println("Index found at position " + position);
        }
    }
    public static int search(int value,int[]data){
        for(int i=0;i<data.length;i++){
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }
}
