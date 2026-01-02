
// Time Complexity :
//
// Best Case    : O(n)
//  - When the array is already sorted
//  - The while loop never executes (only one comparison per element)
//
// Average Case : O(n^2)
//  - When elements are in random order
//  - Each element may need to be compared and shifted multiple times
//
// Worst Case   : O(n^2)
//  - When the array is reverse sorted
//  - Every element shifts across the entire sorted portion
//
//
// Space Complexity :
//
// O(1)
//  - In-place sorting algorithm
//  - Uses only constant extra variables (curr, prev)
//  - No additional memory proportional to input size is used

package sortingalgorithms;
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
