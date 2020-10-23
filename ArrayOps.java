public class ArrayOps {
public static int[][] invertArray(int[][] matrix) {
	int newarr[][] = new int[matrix[0].length][matrix.length];
	for (int row = 0; row < matrix.length; row++) {
		for (int col = 0; col < matrix[row].length; col++) {
			newarr[col][row] = matrix[row][col];
		}
	}
	return newarr;
}

public static boolean isRowMagic(int[][] matrix) {
	int sums[] = sumRows(matrix);
	for (int ind = 0; ind < sums.length; ind++) {
		if (sums[0] != sums[ind]) return false;
	}
	return true;
}

public static int[] sumCols(int[][] matrix) {
	return sumRows(invertArray(matrix));
}

public static int sum(int[][] arr) {
	return sum(sumRows(arr));
}

public static int[] largestInRows(int[][] matrix) {
	int newarr[] = new int[matrix.length];
	for (int row = 0; row < matrix.length; row++) {
		newarr[row] = largest(matrix[row]);
	}
	return newarr;
}

public static int[] sumRows(int[][] matrix) {
	int newarr[] = new int[matrix.length];
	for (int row = 0; row < matrix.length; row++) {
		newarr[row] += sum(matrix[row]);
	}
	return newarr;
}

public static int sum(int[] arr) {
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	return sum;
}

public static int largest(int[] arr) {
	int largest = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] > largest) {
			largest = arr[i];
		}
	}
	return largest;
}
}
