import java.util.Arrays;

public class reverseAnArray {
    public static void main (String[]args){
        reverseAnArray reverse = new reverseAnArray();

        int arr1[] = {1, 4, 3, 2, 6, 5};
        System.out.println("Original arr1: " + Arrays.toString(arr1));
        reverse.reverseArray(arr1);
        System.out.println("Reversed arr1: " + Arrays.toString(arr1));
        System.out.println("---");

        int arr2[] = {4,5,2};
        System.out.println("Original arr2: " + Arrays.toString(arr2));
        reverse.reverseArray(arr2);
        System.out.println("Reversed arr2: " + Arrays.toString(arr2));
        System.out.println("---");

        int arr3[] = {1};
        System.out.println("Original arr3: " + Arrays.toString(arr3));
        reverse.reverseArray(arr3);
        System.out.println("Reversed arr2: " + Arrays.toString(arr3));
        System.out.println("---");
    }
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
