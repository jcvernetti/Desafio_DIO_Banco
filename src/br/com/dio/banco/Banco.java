package br.com.dio.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void inserirConta (Conta conta) {
		if (contas.contains(conta)){
			System.out.println("Essa conta já existe.");
		} else {
			contas.add(conta);
		}
	}
	
	public void imprimirListaClientes() {
		for (Conta conta: contas) {
//			System.out.println(conta.cliente.getNome());
//			System.out.println(conta.agencia);
//			System.out.println(conta.numero);
//			System.out.println(conta.saldo);
			conta.imprimirInfosComuns();
			System.out.println("=============================");
		}
	}
}
