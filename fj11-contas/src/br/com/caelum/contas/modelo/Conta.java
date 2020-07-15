/**
 * 
 * 
 */

package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void saca(double valor) {
		this.saldo -= valor;
	}

	/** */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	abstract public String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero:	" + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Titular: " + this.titular + " Agencia: " + this.agencia + "Tipo da Conta: " + this.getTipo();
//	}
}
