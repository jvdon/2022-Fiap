public final class ClientePF extends Cliente {  //final proíbe a herança desta classe

	private final String CPF; 
	

	public ClientePF(String nome, String endereco, String dataNasc, String cpf) {
		super(nome, endereco, dataNasc);
		this.CPF = cpf;
	}

	public String getCpf() {
		return CPF;
	}
	
}
