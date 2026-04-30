import java.util.Arrays;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        SlidingWindowTechnique slide = new SlidingWindowTechnique();
        int arr1[] = {5,2,-1,0,3};
        System.out.println("Original arrar: "+ Arrays.toString(arr1));
        System.out.println("max sum of subarray of size k " + slide.maxSum(arr1, 5, 3));

        int arr2[] = {1,4,2,10,23,3,1,0,20};
        System.out.println("Original arrar: "+ Arrays.toString(arr2));
        System.out.println("max sum of subarray of size k " + slide.maxSum(arr2, 9, 4));
    }
    int maxSum(int arr[],int n,int k){
        int max_sum = 0;{
            for(int i=0;i<n-k+1;i++){
                int curr_sum = 0;
                for(int j=0;j<k;j++){
                    curr_sum = curr_sum + arr[i+j];
                }
                max_sum = Math.max(curr_sum,max_sum);
            }
        }
        return max_sum;
    }
}
