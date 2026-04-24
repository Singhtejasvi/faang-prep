import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        SortedSquare square = new SortedSquare();
        int arr1[] = {-4,-1,0,3,10};
        System.out.println("Original arr: " + Arrays.toString(arr1));
        System.out.println("Sqaured sorted array: " + Arrays.toString(square.SortedSquares(arr1)));

        int arr2[] = {-7,-3,2,3,11};
        System.out.println("Original arr: " + Arrays.toString(arr2));
        System.out.println("Sqaured sorted array: " + Arrays.toString(square.SortedSquares(arr2)));
    }
    int[] SortedSquares(int[] nums){
        int size = nums.length;
        int result[] = new int[size];

        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            result[i] = curr * curr;
        }
        Arrays.sort(result);
        return result;
    }
}
