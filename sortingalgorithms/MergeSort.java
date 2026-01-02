/*
 MERGE SORT (Divide and Conquer Algorithm)

 Time Complexity:
 - Best Case    : O(n log n)
 - Average Case : O(n log n)
 - Worst Case   : O(n log n)

 Space Complexity:
 - O(n) extra space for temporary array during merging
 - O(log n) recursion stack
 - Overall Space Complexity: O(n)

 Key Properties:
 - Stable sorting algorithm
 - Not in-place
 - Guarantees consistent performance
*/

package sortingalgorithms;
import java.util.ArrayList;
public class MergeSort {
    public static void main(String[] args){
        int [] arr = {3,4,9,1,3,2,10,0};
        mergeSort(arr,0,arr.length-1);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    static void merge(int[] arr, int start, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid + 1;

        //Merge Both Halves
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){ // Changes from <= to >= to make it descending order
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        } 

        // Left Half Residue Check and fill (if Any)
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
        //Right Half Residue Check and fill (if Any)
        while(j <= end){
            temp.add(arr[j]);
            j++;
        }

        for(int idx = 0; idx < temp.size(); idx++){
            arr[start+idx] = temp.get(idx);
        }
    }

    static void mergeSort(int [] arr, int start, int end){
        if(start < end){
        int mid = start + (end - start)/2;
        mergeSort(arr,start,mid);
        //Left Half
        mergeSort(arr,mid+1,end);
        //Right Half
        merge(arr,start,mid,end);
    }
    }
}
