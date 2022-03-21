//superclass
public abstract class Conta {

	// atributos
	protected final Cliente cliente; // composição
	protected final long numeroConta;
	protected double saldo;
	private static long contador; // transforma a variável como sendo da Classe e não do objeto

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
//		System.out.println("Operação realizada");
	}

	public void transferir(double valor, Conta conta) throws SaldoInsuficiente{
		this.sacar(valor);
		conta.depositar(valor);
	}

	public abstract void exibirSaldo(); // abstract no método força a reescrita.
}
