/**
 * Implements a MoHiArray class which uses an array of integers as its base.
 * The class provides a series of methods that perform operations on the array.
 * @author
 * @version 1.0
 * @since 2024-10-xx
 */


class MoHiArray {
        /** underlying array to hold the data **/
    private int [] array;


    /**
     * Constructor
     * @param the array of integers to store
     */
    public MoHiArray(int [] a) {
        array = a;
    }

        // TODO: complete the methods below per the Java doc

    /**
     * Find the largest value in the array
     * @return int he largest value in the array. If the array is of size 0, returns Integer.MIN_VALUE
     */
    public int max() {
        int m = Integer.MIN_VALUE;  // set the min value as a starting place

        return m;
    }

    /**
     * Find the smallest value in the array
     * @return int the small value in the array. If the array is of size 0, returns Integer.MAX_VALUE
     */
    public int min() {
        int m = Integer.MAX_VALUE;  // set the max value as a starting place

        return m;
    }

    /**
     * Calculate the average of the values in the array
     * @return double the average of the values in tha array. If the array is of size 0, returns 0.
     */
    public double mean() {
        double avg = 0;  // sets 0 as the starting place

        return avg;
    }

    /**
     * Multiplies all values in the array by a scaling factor.
     * @param c The value by which to multiply all values in the array
     */
    public void scale(int c) {

    }

    /**
     * Determines whether all values in the array are in ascending order.
     * @return boolean whether the values in the array are in ascending order
     */
    public boolean inOrderAsc() {
        
        return false;
    }

    /**
     * Determines whether all values in the array are in descending order.
     * @return boolean whether the values in the array are in descending order
     */
    public boolean inOrderDesc() {
        
        return false;
    }

    /**
     * Assigns values higher than a threshold value to another value
     * @param threshold The value that array values need to be above
     * @param trimValue The value to replace those values with
     */
    public void trimAbove(int threshold, int trimValue) {
        
    }

    /**
     * Forces values to be within the range [min, max]. If a value is outside of that range
     * it is set to the min/max as appropriate
     * @param min The min value of the range
     * @param max The max value of the range
     */
    public void clamp(int min, int max) {
        
    }


    // you do not need to do anything with this method
    public int [] getValues() {
        int [] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // you do not need to do anything with this method
    @Override
    public String toString() {
        if (array.length == 0) return "[]";
        if (array.length == 1) return "["+array[0]+"]";

        String data = "";
        for (int n : array) {
            data += n + ", ";
        }

            // return with brackets and chop the trailing ", "
        return "["+data.substring(0, data.length()-2)+"]";
    }
}