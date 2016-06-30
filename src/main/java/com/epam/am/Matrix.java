package com.epam.am;

import java.util.Arrays;

public class Matrix {
    private double[][] numbers;

    public Matrix(int cols, int rows) {
        numbers = new double[cols][rows];
    }

    public void setNumber(int colIndex, int rowIndex, double number) {
        checkIndex(colIndex, rowIndex);

        numbers[colIndex][rowIndex] = number;
    }

    public int getColCount() {
        return numbers.length;
    }

    public int getRowCount() {
        return getColCount() == 0 ? 0 : numbers[0].length;
    }

    public double getNumber(int colIndex, int rowIndex) {
        checkIndex(colIndex, rowIndex);

        return numbers[colIndex][rowIndex];
    }

    private void checkIndex(int colIndex, int rowIndex) {
        if (colIndex >= getColCount() || rowIndex >= getRowCount()) {
            throw new MatrixException(String.format("Invalid number index. col: %d; row: %d", colIndex, rowIndex));
        }
    }

    public String toFormattedString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < getRowCount(); i++) {
            stringBuilder.append("| ");
            for (int j = 0; j < getColCount(); j++) {
                stringBuilder.append(getNumber(j, i)).append(' ');
            }
            stringBuilder.append("|\n");
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
