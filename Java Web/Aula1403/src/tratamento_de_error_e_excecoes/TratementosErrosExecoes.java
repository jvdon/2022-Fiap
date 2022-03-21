package tratamento_de_error_e_excecoes;

public class TratementosErrosExecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 1, v2 = 0, res = 0;
		int[] numeros = new int[3];

		for (int i = 0; i < numeros.length; i++) {
			try {
				if (i == 0) {
					res = v1 / v2;
				} else {
					numeros[2] = 4;
				}
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception: " + e.getMessage());
			}
			System.out.println("i = " + i);
			System.out.println("res = " + res);
		}
	}
}
