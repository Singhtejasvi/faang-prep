import java.util.Arrays;

public class MoveAllZeroesToEnd{
    public static void main(String[] args) {
        MoveAllZeroesToEnd zeroesToEnd = new MoveAllZeroesToEnd();
        
        int arr1[] = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Orignal array1: " + Arrays.toString(arr1));
        zeroesToEnd.pushZerosToEnd(arr1);
        System.out.println("Updated array1: " + Arrays.toString(arr1));

        int arr2[] = {10, 20, 30};
        System.out.println("Orignal array2: " + Arrays.toString(arr2));
        zeroesToEnd.pushZerosToEnd(arr2);
        System.out.println("Updated array2: " + Arrays.toString(arr2));

        int arr3[] = {0,0};
        System.out.println("Orignal array3: " + Arrays.toString(arr3));
        zeroesToEnd.pushZerosToEnd(arr3);
        System.out.println("Updated array3: " + Arrays.toString(arr3));
    }
    void pushZerosToEnd(int[] arr) {
       int count = 0;
       for(int i=0;i<arr.length;i++){
           if(arr[i] != 0){
               arr[count] = arr[i];
               count++;
           }
       }
       while(count < arr.length){
           arr[count] = 0;
           count++;
       }
    }
}