public class Matrixmult {

    public static int[][] multiplyMatrices(int[][] M1, int[][] M2) {
        int r1 = M1.length;
        int c1 = M1[0].length;
        int r2 = M2.length;
        int c2 = M2[0].length;

    
        if (c1 != r2) {
            System.out.println("Matrices cannot be multiplied.");
            return null; 
        }

        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) { 
                    product[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] M1 = {{1, 2, 3}, {4, 5, 6}}; 
        int[][] M2 = {{7, 8}, {9, 10}, {11, 12}};

        System.out.println("Matrix A:");
        printMatrix(M1);
        System.out.println("\nMatrix B:");
        printMatrix(M2);

        int[][] resultMatrix = multiplyMatrices(M1, M2);

        if (resultMatrix != null) {
            System.out.println("\nProduct of Matrices:");
            printMatrix(resultMatrix);
        }
    }
}