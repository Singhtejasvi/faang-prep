class SecondLargest{
    public static void main(String[]args){
        SecondLargest obj = new SecondLargest();

        //test case 1 - normal array
        int[] arr1 = {12,35,1,10,34,1};
        System.out.println("Test 1: " + obj.getSecondLargest(arr1));

        // test case 2 - duplicates
        int[] arr2 = {10,10,10};
        System.out.println("Test 2: " + obj.getSecondLargest(arr2));

        //test case 3 - two elements
        int[] arr3 = {5,3};
        System.out.println("Test 3: " + obj.getSecondLargest(arr3)); 
    }

    public int getSecondLargest(int[] arr){
        if(arr.length <2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) secondLargest = arr[i];
        }
        if(secondLargest == Integer.MIN_VALUE) return -1;
        else return secondLargest;
    }
}