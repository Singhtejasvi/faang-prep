import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        RemoveDuplicateSortedArray remove = new RemoveDuplicateSortedArray();

        int[] arr1 = {1,1,2};
        System.out.println("Original array: " + Arrays.toString(arr1));
        
        // Capture the new length returned by the method
        int k1 = remove.removeDuplicate(arr1);
        
        // Use Arrays.copyOf to print ONLY the valid elements (from index 0 up to k1)
        int[] validArr1 = Arrays.copyOf(arr1, k1);
        System.out.println("Modified array (valid part): " + Arrays.toString(validArr1));
        System.out.println("New length: " + k1);
        
        System.out.println("-------------------------");

        // --- Test Case 2 ---
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Original array: " + Arrays.toString(arr2));
        
        int k2 = remove.removeDuplicate(arr2);
        
        int[] validArr2 = Arrays.copyOf(arr2, k2);
        System.out.println("Modified array (valid part): " + Arrays.toString(validArr2));
        System.out.println("New length: " + k2);
    }
    public int removeDuplicate(int arr[]){
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
