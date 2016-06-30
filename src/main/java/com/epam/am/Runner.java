package com.epam.am;

public class Runner {
    public static void main(String[] args) {
        MatrixFactory factory = new MatrixFactory(0, 10);
        Matrix matrixA = factory.createRandomMatrix(4, 2);
        Matrix matrixB = factory.createRandomMatrix(1, 4);

        printMatrix(matrixA);
        printMatrix(matrixB);

        MatrixMultiplier multiplier = new SimpleMatrixMultiplier();
        Matrix matrixC = multiplier.multiply(matrixA, matrixB);
        printMatrix(matrixC);
    }

    private static void printMatrix(Matrix matrix) {
        System.out.println(matrix.toFormattedString());
        System.out.println();
    }
}
