/**
 * Tests the MoHiArray class. You do not need to make any changes here, but you
 * should start looking at it to get an idea.
 * @author J. Cihlar
 * @version 1.0
 * @since 2024-10-15
 */


 class MoHiArrayTester {

    public static void main(String [] args) {
        int [] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        MoHiArray arr = new MoHiArray(array);

        System.out.printf("Original array: %s\n", arr);
        System.out.printf("Max: %d, Expected 9\n", arr.max());
        System.out.printf("Min: %d, Expected 0\n", arr.min());
        System.out.printf("Avg: %.2f, Expected 4.50\n", arr.mean());
            // double the values
        arr.scale(2);
        System.out.printf("Scale by 2: %s. Expected {0, 2, 4, 6, 8, 10, 12, 14, 16, 18}\n", arr);
            // trim values above 10 to 10
        arr.trimAbove(10, 10);
        System.out.printf("Trim values above 10 to 10: %s. Expected {0, 2, 4, 6, 8, 10, 10, 10, 10, 10}\n", arr);
            // test ordering
        System.out.printf("In asc order? %b. Expected true.\n", arr.inOrderAsc());
        System.out.printf("In desc order? %b. Expected false.\n", arr.inOrderDesc());

            // double the values again
        arr.scale(2);
            // clamp to [4, 15]
        arr.clamp(4, 15);
        System.out.printf("Clamp to [4, 15]: %s. Expected {4, 4, 8, 12, 15, 15, 15, 15, 15, 15}\n", arr);

            // multiply values by -1
        arr.scale(-1);
        System.out.printf("Scale by -1: %s. Expected {0, -2, -4, -8, -10, -10, -10, -10, -10}\n", arr);
        System.out.printf("In asc order? %b. Expected false.\n", arr.inOrderAsc());
        System.out.printf("In desc order? %b. Expected true.\n", arr.inOrderDesc());

    }
}

