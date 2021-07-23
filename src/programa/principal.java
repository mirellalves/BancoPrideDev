package programa;

import dominio.Conta;

public class principal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.numeroAgencia="001";
		conta.numeroConta="0001";
		
		System.out.println(conta.numeroAgencia);
		
	}	
	
	
}
