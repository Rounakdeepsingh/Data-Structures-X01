//Time complexity :::
//Best Case : O(n) --> sorted array
//Average Case : O(n^2) --> Random Order
//Worst Case : O(n^2) --> Reverse Order

//Space Complexity :::O(1) --> even with temp because Space complexity measures:
//Extra memory that grows with input size (n)

package sortingalgorithms;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,6,1,8};
        bSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean isSwap = false; // Sorted Array Check
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){ // Change symbol from > to < to get the same array in desc order
                    Swap(arr, j, j+1);
                    isSwap = true;
                }
            }
            if(!isSwap){ //Array is already Sorted
            break;
        }
        }
    }
}
