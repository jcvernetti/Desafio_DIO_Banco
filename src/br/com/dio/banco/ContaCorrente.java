package br.com.dio.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, String tipo) {
		super(cliente, tipo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===  Extrato Conta Corrente  ===");
		super.imprimirInfosComuns();
	}

	

	
}
