package br.com.dio.banco;

public class ContaPoupanca extends Conta  {
	
	public ContaPoupanca(Cliente cliente, String tipo) {
		super(cliente, tipo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===  Extrato Conta Poupança  ===");
		super.imprimirInfosComuns();
	}

	
	
}
