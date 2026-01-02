// Time Complexity:
// Best Case    : O(n^2) – No early exit; full scan required for each position
// Average Case : O(n^2) – Random order
// Worst Case   : O(n^2) – Reverse order

// Space Complexity:
// O(1) – In-place sorting using constant extra variables (temp, minIndex)

package sortingalgorithms;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }

     public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1;i++){
            int minIndex = i;
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            Swap(arr,i,minIndex);
        }
    }

}
