import java.util.Arrays;

public class Tester {
public static void main(String[] args) {
	int[] A = {1, 3, 41, 5};
	int[][] B = { {0, 5, 10, 15}, {0, -5, -10, -15}, {999, 1, 0, 0}};
	int[][] C = { {10000, 0, 1, 0}, {-1, -1, -1, -1}, {0, 1, 0, 1}};
	System.out.println("Sum of 1D array:");
	System.out.println(ArrayOps.sum(A));

	System.out.println("Largest of 1D array:");
	System.out.println(ArrayOps.largest(A));

	System.out.println("Sum of each row in 2D array:");
	System.out.println(Arrays.toString(ArrayOps.sumRows(B)));
	System.out.println(Arrays.toString(ArrayOps.sumRows(C)));

	System.out.println("Largest of each row in 2D array:");
	System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));
	System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));

	System.out.println("Sum of everything in 2D array:");
	System.out.println(ArrayOps.sum(B));
	System.out.println(ArrayOps.sum(C));
}
}
