package matrixPrograms;

public class Tester {
    public static void main(String[] args) {
        checkMatrixMultiplication();
//        checkMatrixTranspose();
//        checkMatrixCalculation();
//        checkReadAndPrintMatrix();
    }

    private static void checkMatrixMultiplication() {
        Matrix2D.multiplyTwoMatrix();
    }

    private static void checkMatrixTranspose() {
        Matrix2D.transposeMatrix();
    }

    private static void checkMatrixCalculation() {
        Matrix2D.doMatrixCalculation();
    }

    private static void checkReadAndPrintMatrix() {
        Matrix2D.readAndPrintMatrix("Matrix A");
    }
}
