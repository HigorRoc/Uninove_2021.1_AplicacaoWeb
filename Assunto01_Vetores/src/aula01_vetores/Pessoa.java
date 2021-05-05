package aula01_vetores;

public class Pessoa {
	
	//Construtor Personalizado
	public Pessoa(String nome, String estado){
		this.nome = nome;
		this.estado = estado;
	}

	
	//Construtor Padr�o
	public Pessoa() {
	}
	
	
	//Propriedades ou Atributos
	private String nome;
	private String estado;
	
	
	//M�todods Get/Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		
		if(estado.equals("SP")) {
		this.estado = estado;
		}else {
			System.out.println("Cadastro Inv�lido");
			System.exit(1);
		}
	}
}
