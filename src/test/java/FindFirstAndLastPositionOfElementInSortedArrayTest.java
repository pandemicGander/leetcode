import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {


    @Test
    void test() {
        int[] arr = {1, 2, 3, 3, 3, 3, 3, 4, 5, 6};
        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(arr, 3);
        assertEquals(2, result[0]);
        assertEquals(6, result[1]);
    }

    @Test
    void test2() {
        int[] arr = {2,2};
        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(arr, 2);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}