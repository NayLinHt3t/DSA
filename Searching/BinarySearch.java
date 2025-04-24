package Searching;
//runtime complexity: O(log n)
//Disadvantage: Can't be used for unsorted data
//Advantage: Useful for very large data set
//           Half of the array is eliminated during each step
public class BinarySearch {
    public static void main(String [] args){
        int[] data = { 2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27,
                28, 33, 37 };
        int value = 22;
        int position = sort(data,value);
        if(position != -1){
            System.out.println("The value is found in the position :" + position);
        }
    }
    public static int sort(int[] data,int target){
        int low = 0;
        int high = data.length - 1;
        while (low <= high){
            int middle = low + (high - low) / 2;    //eliminating half of the element
            int value = data[middle];               //take the value of the middle index
            if(value < target){                     //if the middle value is less than the target value
                low = middle + 1;                   //increase the low value by middle+1
                                                    //(the new low will be on the upper half of the array)
            }else if(value > target){               //if the middle value is less than target value
                                                    //(the new high will be on the lower half of the array)
                high = middle -1 ;                  //decrease the high value to middle-1
            }else{                                  //else target == middle
                return middle;
            }
        }
        return -1;
    }
}
