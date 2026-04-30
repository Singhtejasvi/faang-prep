import java.util.Arrays;

public class CheckNandDoubleExist {
    public static void main(String[] args) {
        CheckNandDoubleExist check = new CheckNandDoubleExist();

        int arr1[] = {10,2,5,3};
        System.out.println("Original array: " + Arrays.toString(arr1));
        Boolean bool = check.checkDouble(arr1);
        System.out.println("Array contains Double of N : " + bool);

        int arr2[] = {3,1,7,11};
        System.out.println("Original array: " + Arrays.toString(arr2));
        Boolean bool2 = check.checkDouble(arr2);
        System.out.println("Array contains Double of N : " + bool2);
    }
    Boolean checkDouble (int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
/*Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 

Constraints:

2 <= arr.length <= 500
-103 <= arr[i] <= 103 */