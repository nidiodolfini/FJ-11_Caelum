/**
 * 
 * 
 */

package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		this.saldo -= valor;
	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	/** */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	abstract public String getTipo();

	public void transfere(double valor, Conta conta) {
		try {
			this.saca(valor);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
//		result = prime * result + numero;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Conta other = (Conta) obj;
//		if (agencia == null) {
//			if (other.agencia != null)
//				return false;
//		} else if (!agencia.equals(other.agencia))
//			return false;
//		if (numero != other.numero)
//			return false;
//		return true;
//	}

	public String getTitular() {
		return titular;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";

	}
}
