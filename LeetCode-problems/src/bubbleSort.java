import java.util.Arrays;

public class bubbleSort {
    public int[] bubbleSortAlgo(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,8};
        bubbleSort b = new bubbleSort();

        int[] result = b.bubbleSortAlgo(arr);
        System.out.println(Arrays.toString(result));

         }
}
