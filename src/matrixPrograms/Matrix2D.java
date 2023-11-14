package matrixPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Matrix2D {
    public static Integer[][] readAndPrintMatrix(String matrixName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of rows in " + matrixName + ":\n");
        int rows = scanner.nextInt();
        System.out.println("\nEnter no. of columns in " + matrixName + ":\n");
        int columns = scanner.nextInt();

        if (rows == 0) {
            System.out.println("Rows must be greater than zero!");
            throw new IllegalArgumentException("Rows must be greater than zero!");
        }
        if (columns == 0) {
            System.out.println("Columns must be greater than zero!");
            throw new IllegalArgumentException("Columns must be greater than zero!");
        }

        System.out.println("\nEnter " + matrixName + " elements:\n");
        Integer[][] numberMatrix = new Integer[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numberMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEntered matrix is:\n");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(numberMatrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int[] row : numberMatrix) {
//            for (int element : row) {
//                System.out.print(element + "\t");
//            }
//            System.out.println();
//        }
//        for (int[] row : numberMatrix) {
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println(Arrays.deepToString(numberMatrix));

        printMatrix(numberMatrix);

        return numberMatrix;
    }

    public static void doMatrixCalculation() {
        System.out.println("Enter matrices count:\n");
        Scanner scanner = new Scanner(System.in);
        int matrixCount = scanner.nextInt();
        System.out.println("\nAVAILABLE OPTIONS :\n");
        System.out.println("0 - ADDITION\n");
        System.out.println("1 - SUBTRACTION\n");
        System.out.println("Rows and columns of all input matrices must be same !!!\n");
        System.out.println("Enter your option :\n");
        int type = scanner.nextInt();

        if (type == MatrixCalcType.ADD.ordinal()) {
            computeResultMatrix(matrixCount, MatrixCalcType.ADD.ordinal());
        } else if (type == MatrixCalcType.SUBTRACT.ordinal()) {
            computeResultMatrix(matrixCount, MatrixCalcType.SUBTRACT.ordinal());
        } else {
            throw new IllegalArgumentException("Unknown operation specified. Available operations are ADD and SUBTRACT only\n");
        }
    }

    private static void computeResultMatrix(int matrixCount, int type) {
        Map<String, Integer[][]> inputMatrices = new HashMap<>();
        for (int i = 0; i < matrixCount; i++) {
            String matrixName = "Matrix " + (i + 1);
            System.out.println();
            inputMatrices.put(matrixName, readAndPrintMatrix(matrixName));
        }

        Integer[][] resultMatrix = null;
        for (int mapIndex = 0; mapIndex < inputMatrices.size(); mapIndex++) {
            Integer[][] matrix = inputMatrices.get("Matrix " + (mapIndex + 1));
            int rows = matrix.length;
            int columns = matrix[0].length;

            if (resultMatrix == null) {
                resultMatrix = new Integer[rows][columns];
                // Initialize sum matrix
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (type == MatrixCalcType.ADD.ordinal())
                            resultMatrix[i][j] = 0;
                        else
                            resultMatrix[i][j] = matrix[i][j];
                    }
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (type == MatrixCalcType.ADD.ordinal()) {
                        resultMatrix[i][j] = resultMatrix[i][j] + matrix[i][j];
                    } else if (type == MatrixCalcType.SUBTRACT.ordinal()) {
                        if (mapIndex != 0)
                            resultMatrix[i][j] = resultMatrix[i][j] - matrix[i][j];
                    } else {
                        resultMatrix[i][j] = 0;
                    }
                }
            }
        }

        System.out.println("\nFinal Result:\n");
        if (resultMatrix != null) {
            printMatrix(resultMatrix);
        }
    }

    private static void printMatrix(Integer[][] resultMatrix) {
        Arrays.stream(resultMatrix).forEach(row -> {
            Arrays.stream(row).forEach(element -> System.out.print(element + " "));
            System.out.println();
        });
    }

    public static void transposeMatrix() {
        Integer[][] inputMatrix = readAndPrintMatrix("Matrix A");
        int rows = inputMatrix.length;
        int columns = inputMatrix[0].length;

        int M = rows, N = columns;
        if (rows != columns) {
            M = columns;
            N = rows;
        }

        Integer[][] outputMatrix = new Integer[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                outputMatrix[i][j] = inputMatrix[j][i];
                System.out.println("outputMatrix[" + i + "][" + j + "]" + " = " + "inputMatrix[" + j + "][" + i + "]");
            }
        }

        System.out.println("Transposed Matrix : \n");
        printMatrix(outputMatrix);
    }

    public static void multiplyTwoMatrix() {
        Integer[][] matA = readAndPrintMatrix("Matrix A");
        Integer[][] matB = readAndPrintMatrix("Matrix B");

        int matARows = matA.length;
        int matACols = matA[0].length;
        int matBRows = matB.length;
        int matBCols = matB[0].length;

        if (matACols != matBRows) {
            System.out.println("Matrix A columns should match with Matrix B rows");
            return;
        }

        //  0 1 2
        // [1 2 3] [1] 0
        //         [2] 1
        //         [3] 2

        Integer[][] result = new Integer[matARows][matBCols];
        // Initialize sum matrix
        for (int i = 0; i < matARows; i++) {
            for (int j = 0; j < matBCols; j++) {
                result[i][j] = 0;
            }
        }

        for (int i = 0; i < matARows; i++) {
            for (int j = 0; j < matBCols; j++) {
                for (int k = 0; k < matACols; k++) {
                    result[i][j] = result[i][j] + (matA[i][k] * matB[k][j]);
                }
            }
        }

        System.out.println("Multiply Matrix result: \n");
        printMatrix(result);
    }
}
