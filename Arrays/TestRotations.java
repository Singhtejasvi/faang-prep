import java.util.Arrays;

public class TestRotations {

    public static void main(String[] args) {
        TestRotations tester = new TestRotations();

        // --- Test Case 1 ---
        int[] arrLeft = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arrLeft));
        
        tester.rotateAntiClockwise(arrLeft, 2); // Using the +d formula
        System.out.println("Anti-Clockwise (Left) Rotation: " + Arrays.toString(arrLeft));
        
        System.out.println("---");

        int[] arrRight = {1, 2, 3, 4, 5}; // Reset array for the next test
        System.out.println("Original Array: " + Arrays.toString(arrRight));
        
        tester.rotateClockwise(arrRight, 2); // Using the -d formula
        System.out.println("Clockwise (Right) Rotation:     " + Arrays.toString(arrRight));
    }

    /**
     * This method performs an ANTI-CLOCKWISE (LEFT) rotation using the +d formula.
     */
    public void rotateAntiClockwise(int[] arr, int d) {
        System.out.println("... Calling rotateAntiClockwise (+d) ...");
        int size = arr.length;
        if (size == 0) return;
        d = d % size;
        
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < size; i++) {
            arr[i] = temp[(i + d) % size];
        }
    }

    /**
     * This method performs a CLOCKWISE (RIGHT) rotation using the -d formula.
     */
    public void rotateClockwise(int[] arr, int d) {
        System.out.println("... Calling rotateClockwise (-d) ...");
        int size = arr.length;
        if (size == 0) return;
        d = d % size;

        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < size; i++) {
            arr[i] = temp[(i - d + size) % size];
        }
    }
}
