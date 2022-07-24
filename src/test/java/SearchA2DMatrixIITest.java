import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchA2DMatrixIITest {

    @Test
    void tester() {
        int[][] arr = {
                {1,  4,  7,  11, 15},
                {2,  5,  8,  12, 19},
                {3,  6,  9,  16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 5));
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, 20));
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, 50));

    }

    @Test
    void edge() {
        int[][] arr = {
                {-5}
        };
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, -2));
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, -5));
    }
    @Test
    void edgeX() {
        int[][] arr = {
                {-5, 7, 10}
        };
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 7));
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 10));
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, 2));
    }
    @Test
    void edgeY() {
        int[][] arr = {
                {-5},
                {7},
                {10},
        };
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 7));
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 10));
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, 2));
    }
    @Test
    void edgeAdditional() {
        int[][] arr = {
                {1, 4},
                {2, 5},
        };
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 5));
    }

    @Test
    void edgeAdditionalHarder() {
        int[][] arr = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {11,13,15,17,19},
                {12,14,16,18,20},
                {21,22,23,24,25},
        };
        Assertions.assertTrue(new SearchA2DMatrixII().searchMatrix(arr, 13));
    }
    @Test
    void edgeAdditionalHarder2() {
        int[][] arr = {
                {1, 4, 7, 11,15},
                {2, 5, 8, 12,19},
                {3, 6, 9, 16,22},
                {10,13,14,17,24},
                {18,21,23,26,30},
        };
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, 0));
    }
    @Test
    void edgeAdditionalHarder3() {
        int[][] arr = {
                {2, 3, 6, 6, 10},
                {5, 9, 12,17,19},
                {10,14,17,20,20},
                {15,17,20,24,24},
                {20,20,25,26,29},
        };
        Assertions.assertFalse(new SearchA2DMatrixII().searchMatrix(arr, 4));
    }

}