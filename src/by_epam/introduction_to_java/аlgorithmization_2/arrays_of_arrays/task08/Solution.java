package by_epam.introduction_to_java.аlgorithmization_2.arrays_of_arrays.task08;

/*
 * Условие задачи:
 * 8.  В числовой матрице поменять местами два столбца  любых столбца,
 *     т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 *     а его элементы второго переместить в первый.
 *     Номера столбцов вводит пользователь с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static final int[][] MATRIX =   {{1, 8, 3, 9},
                                            {4, 5, 6, 2},
                                            {7, 2, 9, 8},
                                            {6, 1, 8, 7}};

    public static void main(String[] args) {
        printMatrix(MATRIX);

        swapColumns(MATRIX);

        printMatrix(MATRIX);
    }

    /**
     * Swaps columns. The number of columns writes user.
     * @param matrix the matrix
     */
    public static void swapColumns(int[][] matrix){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int m = 0;
        try {
            System.out.println("Number of first column (write and press \"enter\"): ");
            n = Integer.parseInt(reader.readLine());
            System.out.println("Number of second column (write and press \"enter\"): ");
            m = Integer.parseInt(reader.readLine()) ;
            if (n >= matrix.length) {
                throw new ArrayIndexOutOfBoundsException(n);
            } else if (m >= matrix.length){
                throw new ArrayIndexOutOfBoundsException(m);
            } else if (n == 0 && m == 0){
                throw new IOException("n and m cannot be \"0\"");
            }
        } catch (IOException e) {
            System.out.println("Writer's data don't ready!");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }

        for (int i = 0; i < matrix.length; i++){
            int data = matrix[i][n];
            matrix[i][n] = matrix[i][m];
            matrix[i][m] = data;
        }
    }

    /**
     * Prints the matrix.
     * @param matrix the matrix.
     */
    public static void printMatrix(int[][] matrix){
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
