public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr1 = { -18, -12, -10, 0, 5, 9, 14, 55, 87, 92, 95, 99 }; // Ascending order array
        int[] arr2 = { 99, 67, 52, 41, 40, 39, 35, 22, 21, 7, 5, 0, -18, -22 }; // Descending order arrya

        int ans = ReturnIndex2(arr1, -18 /* change target for test */);
        System.out.println(ReturnIndex2(arr2, 52/* change target for test */));
        System.out.println(ans);
    }

    static int ReturnIndex2(int[] arr, int target) {
        // Defining Start and end index for finding middle element
        int start = 0;
        int end = arr.length - 1;

        // creating a boolean term to find if array is ascending or not
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) { // While loop is to check if element is present or not in given array
            // int mid = (start + end)/2; This not correct as (start + end) value may
            int mid = start + (end - start) / 2; // Simplifying it will give (start + end)/2
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) { // If array is ascending this will execute
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            else { // if array is descending the this will execute
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
