package br.com.dio.banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		Banco banco = new Banco();
		banco.setNome("Banco Novo");
		
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		Conta cc1 = new ContaCorrente(joao, "Conta Corrente");
		cc1.depositar(100);
		Conta poupanca1 = new ContaPoupanca(joao, "Conta Poupança");
		cc1.transferir(80, poupanca1);
		banco.inserirConta(cc1);
		banco.inserirConta(poupanca1);
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		Conta cc2 = new ContaCorrente(maria, "Conta Corrente");
		cc2.depositar(200);
		Conta poupanca2 = new ContaPoupanca(maria, "Conta Poupança");
		cc2.transferir(130, poupanca2);
		banco.inserirConta(cc2);
		banco.inserirConta(poupanca2);
		
		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		
		banco.imprimirListaClientes();
		
		
	}

}
