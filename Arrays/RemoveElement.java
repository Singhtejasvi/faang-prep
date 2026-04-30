import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();

        int[] arr1 = {3, 2, 2, 3};
        System.out.println("Original array: " + Arrays.toString(arr1));
        
        // Capture the new length returned by the method
        int k1 = remove.removeVal(arr1, 3);
        
        // Use Arrays.copyOf to print ONLY the valid elements (from index 0 up to k1)
        int[] validArr1 = Arrays.copyOf(arr1, k1);
        System.out.println("Modified array (valid part): " + Arrays.toString(validArr1));
        System.out.println("New length: " + k1);
        
        System.out.println("-------------------------");

        // --- Test Case 2 ---
        int[] arr2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("Original array: " + Arrays.toString(arr2));
        
        int k2 = remove.removeVal(arr2, 2);
        
        int[] validArr2 = Arrays.copyOf(arr2, k2);
        System.out.println("Modified array (valid part): " + Arrays.toString(validArr2));
        System.out.println("New length: " + k2);
    }
    int removeVal(int num[], int val){
        int i = 0;
        for(int j =0;j<num.length;j++){
            if(num[j] != val){
                num[i] = num[j];
                i++;
            }
        }
        return i;
    }
    public int removeDup(int[] arr1, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeDup'");
    }
}
