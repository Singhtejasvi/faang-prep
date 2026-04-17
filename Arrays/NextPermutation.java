import java.util.Arrays;

class NextPermutation{
    public static void main(String[] args) {
        NextPermutation perm = new NextPermutation();
         int arr1[] = {2, 4, 1, 7, 5, 0};
        System.out.println("Original array1 " + Arrays.toString(arr1));
        perm.Permutation(arr1);
        System.out.println("Next Permutation of arr1: " + Arrays.toString(arr1));
        System.out.println("---");

        int arr2[] = {3, 2, 1};
        System.out.println("Original arr2: " + Arrays.toString(arr2));
        perm.Permutation(arr2);
        System.out.println("Next Permutation of  arr2: " + Arrays.toString(arr2));
        System.out.println("---");

        int arr3[] = {3, 4, 2, 5, 1};
        System.out.println("Original arr3: " + Arrays.toString(arr3));
        perm.Permutation(arr3);
        System.out.println("Next Permutation of  arr2: " + Arrays.toString(arr3));
        System.out.println("---");
    }
    void Permutation(int arr[] ) {
        int n = arr.length;
        int p = n-2;
        while(p >= 0 && arr[p] > arr[p+1]){
            p--;
        }
        if(p >= 0){
            int j = n-1;
            while( arr[j] <= arr[p]){
                j--;
            }
            int temp = arr[p];
            arr[p] = arr[j];
            arr[j] = temp;
        }
        int start = p+1;
        int end = n-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}