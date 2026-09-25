package ejemplo;

public class MultiplicacionMatrices {
	public static double[][] multiplicarMatrices(double[][] A, double[][] B) { // O (N*M*K)
		if (A[0].length != B.length) { // O(1)
			throw new IllegalArgumentException(); // O(1)
		}
		double[][] C = new double[A.length][B[0].length]; // O(A.length * B[0].length)
		for (int i = 0; i < A.length; i++) { // O(N) — iteraciones externas
			for (int j = 0; j < B[0].length; j++) { // O(M) — iteraciones intermedias
				for (int k = 0; k < A[0].length; k++) { // O(K) — iteraciones internas
					C[i][j] += A[i][k] * B[k][j]; // O(1) — operación elemental
				}
			}
		}

		return C; // O(1)
	}
}
