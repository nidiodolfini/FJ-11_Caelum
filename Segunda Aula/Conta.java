public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    void saca(double valor) {
        this.saldo -= valor;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: "	+ this.titular;
        dados += "\nNúmero:	" + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        return	dados;
    }
}