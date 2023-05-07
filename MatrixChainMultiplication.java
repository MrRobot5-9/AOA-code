import java.util.Random;

public class MatrixChainMultiplication {
    
    public static int matrixChainOrder(int[] p) {
        int n = p.length - 1;
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];
 
        for (int i = 1; i < n; i++)
            m[i][i] = 0;
 
        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        
        // Print the input numbers
        System.out.print("Input numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
        
        // Print the matrix
        System.out.println("Matrix M:");
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Print the optimal multiplication order
        System.out.println("Optimal multiplication order:");
        printOptimalParenthesis(s, 1, n - 1);
        System.out.println();
 
        return m[1][n - 1];
    }
    
    public static void printOptimalParenthesis(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            printOptimalParenthesis(s, i, s[i][j]);
            printOptimalParenthesis(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }
 
    public static void main(String[] args) {
        int n = 5; // number of matrices
        int[] p = new int[n + 1];
        Random rand = new Random();
        for (int i = 0; i <= n; i++) {
            p[i] = rand.nextInt(10) + 1; // dimensions of matrices between 1 and 10
        }
        int result = matrixChainOrder(p);
        System.out.println("Minimum number of multiplications is " + result);
    }
}
