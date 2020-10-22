import java.util.Arrays;

public class Tester {
public static void main(String[] args) {
	int[] A = {1, 3, 41, 5};
	int[][] B = { {1, 3, 51, 134}, {5, 1, 153, 13541}, {314, 641, 134, 42}};
	int[][] C = { {-1, -3, -51, -134}, {5, 1, 153, -13541}, {-314, -641, 134, -42}};
	System.out.println(ArrayOps.sum(A));
	System.out.println(ArrayOps.largest(A));
	System.out.println(Arrays.toString(ArrayOps.sumRows(B)));
	System.out.println(Arrays.toString(ArrayOps.sumRows(C)));
	System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));
	System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));
}
}
