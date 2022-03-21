//superclass
public abstract class Conta {

	// atributos
	protected final Cliente cliente; // composi��o
	protected final long numeroConta;
	protected double saldo;
	private static long contador; // transforma a vari�vel como sendo da Classe e n�o do objeto

	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}

	public Conta(Cliente cliente, long numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		contador++;
	}

	public void sacar(double valor) throws SaldoInsuficiente {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficiente("Valor indisponivel para saque");
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
//		System.out.println("Opera��o realizada");
	}

	public void transferir(double valor, Conta conta) throws SaldoInsuficiente{
		this.sacar(valor);
		conta.depositar(valor);
	}

	public abstract void exibirSaldo(); // abstract no m�todo for�a a reescrita.
}
