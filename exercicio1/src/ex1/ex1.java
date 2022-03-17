package ex1;

public class ex1 {

	public static void main(String[] args) {

		int invertido = 0, resto;

		long[] numero = new long[] { 15485448, 2195498, 12, 98716549, 9999998999L, 1654891};

		for (int i = 0; i < numero.length; i++) {
			while (numero[i] > 0) {
				resto = (int) (numero[i] % 10);
				invertido = invertido * 10 + resto;
				numero[i] /= 10;
			}

			System.out.println(invertido);
			invertido = 0;
		}

	}

}