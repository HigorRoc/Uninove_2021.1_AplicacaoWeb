package aula01_vetores;

public class VetorDeObj {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[3];         //Criando o vetor com 3 posi�oes
		pessoas[0] = new Pessoa("Maria", "SP");   //Criando o Obj na posi��o 0
		pessoas[1] = new Pessoa("Pedro", "SP");   //Criando o Obj na posi��o 1
		pessoas[2] = new Pessoa("Jo�o", "SP");    //Criando o Obj na posi��o 2
		
		for(Pessoa pessoa:pessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Estado: " + pessoa.getEstado());
			System.out.println();
		}
	}

}
