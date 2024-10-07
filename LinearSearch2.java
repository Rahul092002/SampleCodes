import java.util.*;
public class LinearSearch2 {

    static int[] For2DArray(int[][] arr2, int target){
        for(int i=0; i<arr2.length;i++){
            for(int j = 0;j<arr2[i].length;j++){
                if(arr2[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {12,5,6,9,25,8};
        int ans = arr[0]; //We can also use Integer.MAX_VALUE
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        int[][] Arr = {
            {1,2,98,55},
            {11,62,5},
            {9,76,75,33,22}
        };
        System.out.println(ans);
        System.out.println(Arrays.toString(For2DArray(Arr, 76)));
    }
}