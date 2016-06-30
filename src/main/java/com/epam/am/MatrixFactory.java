package com.epam.am;

import java.util.Random;

public class MatrixFactory {
    private double minValue;
    private double maxValue;
    private Random random;

    public MatrixFactory(double minValue, double maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        random = new Random();
    }

    public Matrix createRandomMatrix(int col, int row) {
        Matrix matrix = new Matrix(col, row);

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix.setNumber(i, j, getRandomNumber());
            }
        }

        return matrix;
    }

    private double getRandomNumber() {
        return minValue + (maxValue - minValue) * random.nextDouble();
    }
}
