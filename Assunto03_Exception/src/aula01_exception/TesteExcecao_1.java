package aula01_exception;

public class TesteExcecao_1 {

	public static void main(String[] args) {
		
		System.out.println("INICIO DO M�TODO MAIN.");
		
		try {
			primeiroMetodo();
		} catch (MyException e) {
			System.err.println("EXCE��O CAPTURADA!");
		}
		
		System.out.println("FIM DO M�TODO MAIN.");
	}
	
	
	public static void primeiroMetodo() throws MyException{
		
		System.out.println("INICIO DO M�TODO 'primeiroMetodo'");
		segundoMetodo();
		System.out.println("FIM DO M�TODO 'primeiroMetodo'");
	}
	
	
	public static void segundoMetodo() throws MyException{
		
		System.out.println("INICIO DO M�TODO 'segundoMetodo'");
		for(int i=0; i<=5; i++) {
			System.out.println("N�MERO: "  + i);
			//System.out.println(10/0);
		}
		System.out.println("FIM DO M�TODO 'segundoMetodo'");
		throw new MyException("EXCE��O ENCAMINHADA!");
	}

}
