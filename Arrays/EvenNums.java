/*Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.*/

import java.util.Arrays;

public class EvenNums {
    public static void main(String[] args) {
        EvenNums even = new EvenNums();

        int arr1[] = {12,345,2,6,7896};
        System.out.println("Original array : " + Arrays.toString(arr1));
        System.out.println("Numbers with even number of digits present in arr1 : " + even.findNumber(arr1));

        int arr2[] = {555,901,482,1771};
        System.out.println("Original array : " + Arrays.toString(arr2));
        System.out.println("Numbers with even number of digits present in arr2 : " + even.findNumber(arr2));
    }
    int findNumber(int[] nums){
        int total = 0;

        for(int i=0;i<nums.length;i++){
            int currentNum = nums[i];
            int count = 0;

            while(currentNum != 0) {
                currentNum /= 10;
                count++;
            }
            if(count % 2 == 0) total++;
        }
        return total;
    }
}
