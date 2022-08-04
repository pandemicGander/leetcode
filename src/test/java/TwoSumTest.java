import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum1() {
        int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(result));
    }
    @Test
    void twoSum2() {
        int[] result = new TwoSum().twoSum(new int[]{3,2,3}, 6);
        assertEquals(Arrays.toString(new int[]{0, 2}), Arrays.toString(result));
    }
}