
public class Executavel {

	public static void main(String[] args) {
		// simulações

		Cliente testeB = new ClientePF("Thomas", "Rua dos bobos, 7", "12/05/02", "123.456.789-01");
		Cliente testeM = new ClientePF("Martha", "Rua dos bobos, 7", "12/05/02", "456.789.123-02");

		Conta testeContaB = new ContaCorrente(testeB, 0);
		Conta testeContaM = new ContaCorrente(testeM, 1);

		testeContaB.depositar(1000);
		testeContaB.exibirSaldo();

		try {
			testeContaB.transferir(100, testeContaM);
			System.out.println("[~] Transferencia realizada!");
		} catch (SaldoInsuficiente e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		testeContaB.exibirSaldo();
		testeContaM.exibirSaldo();
		try {
			testeContaB.sacar(1000);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			System.out.println("[!] Valor indisponivel!");
		}
		testeContaB.exibirSaldo();
	}
}
