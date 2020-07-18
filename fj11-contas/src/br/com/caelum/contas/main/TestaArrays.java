package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for(int i = 0;i<contas.length;i++){
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			// escreva o código para guardar a conta na posição i do array
			contas[i] = conta;
		}
//		System.out.println(contas[0]);
		double soma = 0;
		for(Conta conta: contas ) {
			soma += conta.getSaldo();
			
		}
		System.out.println(soma/contas.length);
		
		
	}
	
}
