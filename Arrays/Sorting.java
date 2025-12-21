import java.util.*;

public class Sorting{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        //Selection_sort(arr);
        // Bubble_sort(arr);
        Insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*//Time complexity - O(N^2) for Best, worst and average Case.

    public static void Selection_sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i <= n- 2; i++){
            int mini = i;

            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            swap(arr, mini, i);
        }
    }
        

    // Time Complexity - O(N^2) for Worst and Average Case but
    // O(N) for best case that is when it is already sorted

    public static void Bubble_sort(int[] arr){
        int n = arr.length;
        for(int i = n - 1; i >=1 ; i--){
            boolean swapped = false; // Flag for Checking swapped Array
            for(int j = 0; j <= i -1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) break; //already sorted
        }
    }
*/

//Time Complexity - Same as Bubble sort
public static void Insertion_sort(int[] arr){
    int n = arr.length;
    for(int i = 1; i < n; i++){
        int j = i;
        boolean swapped = false;
        while(j > 0 && arr[j-1] > arr[j]){
            swap(arr, j-1, j);
            swapped = true;
            j--;
        }
        if(!swapped) break;
    }
}

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}