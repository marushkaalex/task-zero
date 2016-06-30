package com.epam.am;

public abstract class MatrixMultiplier {
    public abstract Matrix multiply(Matrix matrixA, Matrix matrixB);

    public boolean isPossible(Matrix matrixA, Matrix matrixB) {
        int matrixAColCount = matrixA.getColCount();
        int matrixBRowCount = matrixB.getRowCount();
        return matrixAColCount == matrixBRowCount;
    }

    protected void checkPossibility(Matrix matrixA, Matrix matrixB) {
        if (!isPossible(matrixA, matrixB)) {
            throw new MatrixException(
                    String.format(
                            "Column count of matrixA (%d) is not matching row count of matrixB (%d)",
                            matrixA.getColCount(),
                            matrixB.getRowCount()
                    )
            );
        }
    }
}
