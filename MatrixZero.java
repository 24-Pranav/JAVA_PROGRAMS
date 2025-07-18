public class MatrixZero {

    public static void matzero(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        int row[] = new int[rows];
        int col[] = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int mat[][] = { { 1, -1, 1 },
                { -1, 0, 1 },
                { 1, -1, 1 } };

        matzero(mat);
    }
}
