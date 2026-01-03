// Time Complexity: O(n + k)
// n = number of elements in input array
// k = range of values (max element + 1)

// Space Complexity: O(k)
// Extra space used for count array

package sortingalgorithms;
public class countSort {
    public static void main(String[] args){
        //int [] arr = {3,4,9,1,3,2,1000,-192,3663,62,73,0,4,55};
        int [] arr = {3,4,9,0,6,7,10,2,4,0};
        countSort(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    static void countSort(int[] arr){
        if(arr==null || arr.length <= 1){
            return;
        }
            int max = arr[0];
            for(int num : arr){
                if(num > max){
                    max = num;
                }
            }
            int[] countArray = new int[max+1];
            for(int num : arr){
                countArray[num]++;
            }
            int index = 0;
            for(int i =0; i < countArray.length;i++){
            while(countArray[i]>0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
}
