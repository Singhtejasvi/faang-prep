import java.util.ArrayList;
import java.util.Arrays;

class MajorityElement {
   public static void main(String[] args) {
    MajorityElement major = new MajorityElement();

    int arr1[] = {2, 2, 3, 1, 3, 2, 1, 1};
    System.out.println("Original arr1 : " + Arrays.toString(arr1));
    System.out.println("Array sorted in majority element n/3 : " + major.findMajority(arr1));
    System.out.println("---");

    int arr2[] = {-5, 3, -5};
    System.out.println("Original arr2 : " + Arrays.toString(arr2));
    System.out.println("Array sorted in majority element n/3 : " + major.findMajority(arr2));
    System.out.println("---");

    int arr3[] = {3, 2, 2, 4, 1, 4};
    System.out.println("Original arr3 : " + Arrays.toString(arr3));
    System.out.println("Array sorted in majority element n/3 : " + major.findMajority(arr3));
    System.out.println("---");
   } 
   public ArrayList<Integer> findMajority(int[] arr){
    ArrayList<Integer> list = new ArrayList<>();
    Arrays.sort(arr);
    int n = arr.length;
    int count = 1;

    for (int i=1;i<n;i++){
        if(arr[i] == arr[i-1]){ count++;}
        else{
            if(count > n/3 && !list.contains(arr[i-1])){
                list.add(arr[i-1]);
            }
            count = 1 ;
        }
    }
    if(count > n/3 && !list.contains(arr[n-1])){
                list.add(arr[n-1]);
            }
    return list;
   }
}
