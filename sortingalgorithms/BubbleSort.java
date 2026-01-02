package sortingalgorithms;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        Bsort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Bsort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean isSwap = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    Swap(arr, j, j+1);
                    isSwap = true;
                }
            }
            if(!isSwap){
            break;
        }
        }
    }
}
