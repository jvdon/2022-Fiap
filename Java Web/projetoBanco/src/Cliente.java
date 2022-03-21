
//abstract na classe pro�be a inst�ncia desta classe; apenas para heran�a. 
public abstract class Cliente { 

	// atributos
	protected String nome;
	protected String endereco;
	protected final String dataNasc; //transforma a vari�vel em constante     

	// construtor
	public Cliente(String nome, String endereco, String dataNasc) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}

	//m�todos getters / setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNasc() {
		return dataNasc;
	}
}
