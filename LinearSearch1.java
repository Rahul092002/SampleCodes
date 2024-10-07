// Linear Search Algorithm
import java.util.*;
public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {12,16,5,8,66,98,54};
        int ans =LinearSearch(arr, 5);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){ // If array is empty
            return -1;
        }
        for(int i =0; i<arr.length;i++){ // finding index of target element
            if(arr[i]==target){
                return i;
            }
        }
        //This line will execute if target is not in the given array
        return -1;
    }
}
