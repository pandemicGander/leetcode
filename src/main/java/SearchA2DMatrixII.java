import java.util.function.Function;

public class SearchA2DMatrixII {


    public boolean searchMatrix(int[][] matrixInput, int target) {

        Matrix matrix = new Matrix(0, 0, matrixInput);
        if (target == matrix.getCurrentValue(matrixInput)) {
            return true;
        }
        if (target < matrix.getCurrentValue(matrixInput)){
            return false;
        }
        if (matrix.maxSizeX == 1) {
            return checkSingleRow(Matrix::moveDown, matrixInput, target, matrix);
        } else if (matrix.maxSizeY == 1) {
            return checkSingleRow(Matrix::moveRight, matrixInput, target, matrix);
        }


        do {
            if (matrix.getCurrentValue(matrixInput) > target) {
                matrix.moveLeft();
                break;
            }
            if (target == matrix.moveRight().getCurrentValue(matrixInput)) {
                return true;
            }
        } while (!matrix.isFailedMove());

        do {
            if (target == matrix.moveDown().getCurrentValue(matrixInput)) {
                return true;
            }
            if (matrix.getCurrentValue(matrixInput) > target) {
                matrix.moveUp().moveLeft();
            }
        } while (!matrix.isFailedMove());

        return false;
    }

    private boolean checkSingleRow(Function<Matrix, Matrix> moveFunction, int[][] matrixInput, int target, Matrix matrix) {
        matrix.resetFailedMove();
        while (!matrix.isFailedMove()) {
            if (target == moveFunction.apply(matrix).getCurrentValue(matrixInput)) {
                return true;
            }
        }
        return false;

    }


    static class Matrix {
        int x;
        int y;
        private final int maxSizeX;
        private final int maxSizeY;
        private boolean failedMove = false;

        public int getCurrentValue(int[][] matrix) {
            return matrix[y][x];
        }

        public Matrix moveRight() {
            if (x + 1 == maxSizeX) {
                this.failedMove = true;
            } else {
                this.failedMove = false;
                this.x = x + 1;
            }
            return this;
        }

        public Matrix moveLeft() {
            if (x - 1 < 0) {
                this.failedMove = true;
            } else {
                this.failedMove = false;
                this.x = x - 1;
            }
            return this;
        }

        public Matrix moveUp() {
            if (y - 1 < 0) {
                this.failedMove = true;
            } else {
                this.failedMove = false;
                this.y = y - 1;
            }
            return this;
        }

        public Matrix moveDown() {
            if (y + 1 == maxSizeY) {
                this.failedMove = true;
            } else {
                this.failedMove = false;
                this.y = y + 1;
            }
            return this;
        }

        public boolean isFailedMove() {
            return failedMove;
        }

        public int getMaxSizeX() {
            return maxSizeX;
        }

        public int getMaxSizeY() {
            return maxSizeY;
        }

        public Matrix resetFailedMove() {
            this.failedMove = false;
            return this;
        }

        public Matrix(int x, int y, int[][] matrix) {
            this.x = x;
            this.y = y;
            this.maxSizeX = matrix[0].length;
            this.maxSizeY = matrix.length;
        }
    }

}
