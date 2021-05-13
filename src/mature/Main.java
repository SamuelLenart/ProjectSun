package mature;

public class Main {
    public static void main(String[] args) {

        int[][] a = new int[][]{
                {3, 7, 5}, {2, 4, 9}
        };
        int[][] b = new int[][]{
                {7, 2, 9}, {1, 8, 5}, {0, 2, 4}
        };
        int r1 =  2, c1 = 3;
        int r2 = 3, c2 = 3;

        int [][] product = multiply(a, b, r1, c1, c2);

        displayMatrix(product);
    }
        public static int[][] multiply (int[][] a, int[][] b, int r1, int c1, int c2) {
           int[][] product = new int[r1][c2];
           for(int i = 0; i<r1; i++){
               for(int j = 0; j<c2; j++){
                   for(int k = 0; k < c1; k++){
                       product[i][j] += a[i][k] * b[k][j];
                   }
               }
           }
            return product;
        }
        private static void displayMatrix(int[][] matrix) {
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    System.out.print(matrix[r][c] + "\t");
                }
                System.out.println();
            }
        }
    }
