public final class ClientePF extends Cliente {  //final pro�be a heran�a desta classe

	private final String CPF; 
	

	public ClientePF(String nome, String endereco, String dataNasc, String cpf) {
		super(nome, endereco, dataNasc);
		this.CPF = cpf;
	}

	public String getCpf() {
		return CPF;
	}
	
}
