import java.util.Arrays;

public class MaxConsecString {
    public static void main(String[] args) {
        MaxConsecString maxOnes = new MaxConsecString();
        String str1[] = {"Apple", "Apple", "Banana"};
        System.out.println("Original Array: " + Arrays.toString(str1));
        System.out.println("Maximum consecutive ones in arr1 are : " + maxOnes.findMaxConsecutiveStrings(str1));

    }
    public int findMaxConsecutiveStrings(String[] str) {
        if(str == null || str.length == 0) return 0;

        int maxCount = 1;
        int currentCount = 1;
        
        for(int i=1; i < str.length; i++){
            if(str[i] != null && str[i].equals(str[i-1])){
                currentCount++;
                if(currentCount > maxCount) maxCount = currentCount;
            } else{
                currentCount = 1;
            }
        }
        return maxCount;
    }
}
