import java.util.Arrays;

public class Tester {
public static void main(String[] args) {
	int[] A = {1, 3, 41, 5};
	int[][] B = { {0, 5, 10, 15}, {0, -5, -10, -15}, {999, 1, 0, 0} };
	int[][] C = { {10000, 0, 1, 0}, {-1, -1, -1, -1}, {0, 1, 0, 1} };
	int[][] D = { {10}, {10}, {10} };
	int[][] E = { {10, 30, 20, 40}, {10, 40, 20, 30}, {10, 50, 20, 20} };
	int[][] F = { {1, -97, 20, 40}, {1, -6, 15, -40}, {-5, 100, -38, -3} };
	int[][] G = { {2, 4, 2}, {2, 2, 2} };
	int[][] TestCaseA = { {1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9} };
	int[] TestCaseB = {1, 3, 5};
/*
        System.out.println("Sum of 1D array:");
        System.out.println(ArrayOps.sum(A));
        System.out.println(ArrayOps.sum(TestCaseB));
        System.out.println("Largest of 1D array:");
        System.out.println(ArrayOps.largest(A));
        System.out.println("Sum of each row in 2D array:");
        System.out.println(Arrays.toString(ArrayOps.sumRows(B)));
        System.out.println(Arrays.toString(ArrayOps.sumRows(C)));
        System.out.println(Arrays.toString(ArrayOps.sumRows(TestCaseA)));
        System.out.println("Largest of each row in 2D array:");
        System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(TestCaseA)));
        System.out.println("Sum of everything in 2D array:");
        System.out.println(ArrayOps.sum(B));
        System.out.println(ArrayOps.sum(C));
        System.out.println(ArrayOps.sum(TestCaseA));
        System.out.println("Sum of cols:");
        System.out.println(Arrays.toString(ArrayOps.sumCols(B)));
        System.out.println(Arrays.toString(ArrayOps.sumCols(C)));
        System.out.println(Arrays.toString(ArrayOps.sumCols(TestCaseA)));
 */
	System.out.println("Sum of rows the same?");
	System.out.println(ArrayOps.isRowMagic(D));
	System.out.println(ArrayOps.isRowMagic(E));

	System.out.println("Sum of cols the same?");
	System.out.println(ArrayOps.isColMagic(D));
	System.out.println(ArrayOps.isColMagic(E));
	System.out.println(ArrayOps.isColMagic(F));

	System.out.println("Sum of specific sum and col the same?");
	System.out.println(ArrayOps.isLocationMagic(G, 0, 1));
	System.out.println(ArrayOps.isLocationMagic(G, 1, 1));
}
}
