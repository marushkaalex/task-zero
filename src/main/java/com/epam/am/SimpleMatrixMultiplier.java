package com.epam.am;

public class SimpleMatrixMultiplier extends MatrixMultiplier {
    public Matrix multiply(Matrix matrixA, Matrix matrixB) {
        checkPossibility(matrixA, matrixB);

        Matrix resultMatrix = new Matrix(matrixB.getColCount(), matrixA.getRowCount());

        for (int i = 0; i < resultMatrix.getColCount(); i++) {
            for (int j = 0; j < resultMatrix.getRowCount(); j++) {
                double resultNumber = 0;
                for (int k = 0; k < matrixA.getColCount(); k++) {
                    resultNumber += matrixA.getNumber(k, j) * matrixB.getNumber(i, k);
                }
                resultMatrix.setNumber(i, j, resultNumber);
            }
        }

        return resultMatrix;
    }
}
