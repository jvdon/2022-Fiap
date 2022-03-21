package tratamento_de_error_e_excecoes;

public class TesteFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
	}

}
