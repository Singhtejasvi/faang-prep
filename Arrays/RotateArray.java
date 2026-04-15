import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        
        RotateArray rotate = new RotateArray();

        int arr1[] = {1, 2, 3, 4, 5};
        System.out.println("Original array1 " + Arrays.toString(arr1));
        rotate.rotatedArray(arr1,2);
        System.out.println("Rotated arr1: " + Arrays.toString(arr1));
        System.out.println("---");

        int arr2[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Original arr2: " + Arrays.toString(arr2));
        rotate.rotatedArray(arr2,3);
        System.out.println("Rotated arr2: " + Arrays.toString(arr2));
        System.out.println("---");

        int arr3[] = {7, 3, 9, 1,};
        System.out.println("Original arr3: " + Arrays.toString(arr3));
        rotate.rotatedArray(arr3,9);
        System.out.println("Rotated arr2: " + Arrays.toString(arr3));
        System.out.println("---");
    }
    public void rotatedArray(int arr[],int d){
        int size = arr.length;
        
        int out[] = new int[size];
        
        for (int i=0;i<arr.length;i++){
            out[i] = arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = out[(i+d) % size];
        }
    }
}
