/*
Quick Sort Algorithm

Time Complexity:
- Best Case:     O(n log n)
  (Pivot divides the array into two nearly equal halves)

- Average Case:  O(n log n)
  (Random or median pivot selection gives balanced partitions)

- Worst Case:    O(n^2)
  (Occurs when pivot is always the smallest or largest element,
   e.g., already sorted array with poor pivot choice)

Space Complexity:
- Average Case:  O(log n)
  (Recursive call stack due to divide-and-conquer)

- Worst Case:    O(n)
  (Highly unbalanced recursion tree)

In-Place Sorting: YES
Stable: NO
*/

package sortingalgorithms;
public class quickSort {
    public static void main(String[] args){
        int arr[] = {5,4,2,6,7,3,4};
        quickSort(arr,0,arr.length-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    //Swap Function
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Partition Function
    public static int partition(int[] arr, int start, int end){
        int idx = start-1;
        int pivot = arr[end];
        for(int j = start;j < end; j++){
            if(arr[j] <= pivot){ //Change the symbol from <= to >= to make it descending order
                idx++;
                swap(arr,idx,j);
            }
        }
        idx++;
        swap(arr,end,idx);
        return idx;
    }
  
    //QuickSort Function
    public static void quickSort(int[] arr,int start,int end){
        if(start < end){
            int pivIdx = partition(arr,start,end);
            //Left Half
            quickSort(arr,start,pivIdx-1);
            //Right Half
            quickSort(arr,pivIdx+1,end);
        }
    }
}
