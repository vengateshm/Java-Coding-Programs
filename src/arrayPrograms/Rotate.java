package arrayPrograms;

import java.util.Arrays;

public class Rotate {

    // Rotate right
    public int[] rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);//Reverse array
        reverse(arr, 0, k - 1);//Reverse upto k-1
        reverse(arr, k, arr.length - 1);//Reverse from k
        return arr;
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        System.out.println(Arrays.toString(rotate.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }
}
