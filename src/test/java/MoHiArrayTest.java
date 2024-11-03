/**
 * Units tests for the MoHiArray class.
 * @author J. Cihlar
 * @version 1.0
 * @since 2024-10-15
 */

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;

class MoHiArrayTest {
    MoHiArray emptyArray;
    MoHiArray oneElementArray;
    MoHiArray allSame;
    MoHiArray ascArray;
    MoHiArray descArray;

    public static final double DELTA = 1E-5;

    @BeforeEach
    public void setUp() {
        emptyArray = new MoHiArray(new int[]{});
        oneElementArray = new MoHiArray(new int[]{0});
        allSame = new MoHiArray(new int[] {1, 1, 1, 1, 1});
        ascArray = new MoHiArray(new int[] {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        descArray = new MoHiArray(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10});
    }
    @Test
    public void testMin_emptyArray() {
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, emptyArray.min(), 
            String.format("Expected min: %d, but got: %d for array: %s", expected, emptyArray.min(), emptyArray));
    }

    @Test
    public void testMin_oneElementArray() {
        int expected = 0;
        assertEquals(expected, oneElementArray.min(), 
            String.format("Expected min: %d, but got: %d for array: %s", expected, oneElementArray.min(), oneElementArray));
    }

    @Test
    public void testMin_allSame() {
        int expected = 1;
        assertEquals(expected, allSame.min(), 
            String.format("Expected min: %d, but got: %d for array: %s", expected, allSame.min(), allSame));
    }

    @Test
    public void testMin_ascArray() {
        int expected = -10;
        assertEquals(expected, ascArray.min(), 
            String.format("Expected min: %d, but got: %d for array: %s", expected, ascArray.min(), ascArray));
    }

    @Test
    public void testMin_descArray() {
        int expected = -10;
        assertEquals(expected, descArray.min(), 
            String.format("Expected min: %d, but got: %d for array: %s", expected, descArray.min(), descArray));
    }

    @Test
    public void testMax_emptyArray() {
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, emptyArray.max(), 
            String.format("Expected max: %d, but got: %d for array: %s", expected, emptyArray.max(), emptyArray));
    }

    @Test
    public void testMax_oneElementArray() {
        int expected = 0;
        assertEquals(expected, oneElementArray.max(), 
            String.format("Expected max: %d, but got: %d for array: %s", expected, oneElementArray.max(), oneElementArray));
    }

    @Test
    public void testMax_allSame() {
        int expected = 1;
        assertEquals(expected, allSame.max(), 
            String.format("Expected max: %d, but got: %d for array: %s", expected, allSame.max(), allSame));
    }

    @Test
    public void testMax_ascArray() {
        int expected = 10;
        assertEquals(expected, ascArray.max(), 
            String.format("Expected max: %d, but got: %d for array: %s", expected, ascArray.max(), ascArray));
    }

    @Test
    public void testMax_descArray() {
        int expected = 10;
        assertEquals(expected, descArray.max(),
            String.format("Expected max: %d, but got: %d for array: %s", expected, descArray.max(), descArray));
    }

    @Test
    public void testMean_emptyArray() {
        double expected = 0.0;
        assertEquals(expected, emptyArray.mean(), DELTA,
            String.format("Expected mean: %.2f, but got: %.2f for array: %s", expected, emptyArray.mean(), emptyArray));
    }

    @Test
    public void testMean_oneElementArray() {
        double expected = 0.0;
        assertEquals(expected, oneElementArray.mean(), DELTA,
            String.format("Expected mean: %.2f, but got: %.2f for array: %s", expected, oneElementArray.mean(), oneElementArray));
    }

    @Test
    public void testMean_allSame() {
        double expected = 1.0;
        assertEquals(expected, allSame.mean(), DELTA,
            String.format("Expected mean: %.2f, but got: %.2f for array: %s", expected, allSame.mean(), allSame));
    }

    @Test
    public void testMean_ascArray() {
        double expected = 0.0;
        assertEquals(expected, ascArray.mean(), DELTA,
            String.format("Expected mean: %.2f, but got: %.2f for array: %s", expected, ascArray.mean(), ascArray));
    }

    @Test
    public void testMean_descArray() {
        double expected = 0.0;
        assertEquals(expected, descArray.mean(), DELTA,
            String.format("Expected mean: %.2f, but got: %.2f for array: %s", expected, descArray.mean(), descArray));
    }

    @Test
    public void testInOrderAsc_ascArray() {
        assertTrue(ascArray.inOrderAsc(), 
            String.format("Array should be in ascending order, but got: %s", ascArray.inOrderAsc()));
    }

    @Test
    public void testInOrderAsc_descArray() {
        assertFalse(descArray.inOrderAsc(), 
            String.format("Array should not be in ascending order, but got: %s", descArray.inOrderAsc()));
    }

    @Test
    public void testInOrderDesc_descArray() {
        assertTrue(descArray.inOrderDesc(), 
            String.format("Array should be in descending order, but got: %s", descArray.inOrderDesc()));
    }

    @Test
    public void testInOrderDesc_ascArray() {
        assertFalse(ascArray.inOrderDesc(), 
            String.format("Array should not be in descending order, but got: %s", ascArray.inOrderDesc()));
    }

    @Test
    public void testTrimAbove_ascArray() {
        int[] expected = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ascArray.trimAbove(0, 0);
        System.out.println(ascArray.getValues());
        assertArrayEquals(expected, ascArray.getValues(), 
            String.format("Expected trimmed array: %s, but got: %s", 
                java.util.Arrays.toString(expected), ascArray));
    }

    @Test
    public void testClamp_ascArray() {
        int[] expected = {-5, -5, -5, -5, -5, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5};
        ascArray.clamp(-5, 5);
        assertArrayEquals(expected, ascArray.getValues(), 
            String.format("Expected clamped array: %s, but got: %s", 
                java.util.Arrays.toString(expected), ascArray));
    }
}
