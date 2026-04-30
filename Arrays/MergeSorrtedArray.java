import java.util.Arrays;

public class MergeSorrtedArray {
    public static void main(String[] args) {
        MergeSorrtedArray merged = new MergeSorrtedArray();

        int arr1[] = {1,2,3,0,0,0};

        int arr2[] = {2,5,6};
        
        merged.merge(arr1, 3, arr2, 3);
        System.out.println("Merge array " + Arrays.toString(arr1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0;i < n;i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
