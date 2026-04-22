import java.util.Arrays;

public class MaxConsecOnes {
    public static void main(String[] args) {
        MaxConsecOnes maxOnes = new MaxConsecOnes();
        int arr1[] = {1,1,0,1,1,1};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Maximum consecutive ones in arr1 are : " + maxOnes.findMaxConsecutiveOnes(arr1));

        int arr2[] = {1,0,1,1,0,1};
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Maximum consecutive ones in arr2 are : " + maxOnes.findMaxConsecutiveOnes(arr2));

    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount =0;
        
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > maxCount) maxCount = count;
            } else{
                count = 0;
            }
        }
        return maxCount;
    }
}
