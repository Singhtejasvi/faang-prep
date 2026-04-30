public class DuplicateZeroes {
        public static void main(String[] args) {
        DuplicateZeroes dp = new DuplicateZeroes();

        int arr1[] = {1,0,2,3,0,4,5,0};
        System.out.println("Original array: " + arr1);
        dp.duplicateZeroes(arr1);
        System.out.println("Array with Duplicate Zeroes " + arr1 );

        int arr2[] = {1,2,3};
        System.out.println("Original array: " + arr2);
        dp.duplicateZeroes(arr2);
        System.out.println("Array with Duplicate Zeroes " + arr2);
    }

    public void duplicateZeroes(int arr[]){
        // Using two pointer
        int countZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) countZero++;            
        }
        int len = arr.length + countZero;
        for(int i = arr.length-1,j=len-1;i<j;i--,j--){
            if(arr[i] != 0){
                if(j < arr.length) arr[j] = arr[i];
            }
            else{
                if(j<arr.length) arr[j] = arr[i];
                j--;
                if(j<arr.length) arr[j] = arr[i];
            }
        }
    }
}
