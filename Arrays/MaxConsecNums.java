import java.util.Arrays;

public class MaxConsecNums {
    public static void main(String[] args) {
        MaxConsecNums maxOnes = new MaxConsecNums();
        int arr1[] = {2, 2, 3, 3, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Maximum consecutive ones in arr1 are : " + maxOnes.findMaxConsecutiveNums(arr1));

    }
    public int findMaxConsecutiveNums(int[] nums) {
        if(nums.length == 0) return 0;

        int maxCount = 1;
        int currentCount = 1;
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                currentCount++;
                if(currentCount > maxCount) maxCount = currentCount;
            } else{
                currentCount = 1;
            }
        }
        return maxCount;
    }
}
