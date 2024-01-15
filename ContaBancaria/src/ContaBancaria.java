import java.util.Random;

public abstract class ContaBancaria {
    protected int id;
    protected String nome;
    protected String tipoDeConta;
    protected double saldo = 0;
    protected double taxaDeTransferencia = 0;

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getTipoDeConta() {
        return this.tipoDeConta;
    }

    protected void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected double getId() {
        return id;
    }

    protected double getTaxaDeTransferencia() {
        return taxaDeTransferencia;
    }

    protected void setTaxaDeTransferencia(double taxaDeTransferencia) {
        this.taxaDeTransferencia = taxaDeTransferencia;
    }

    protected void consultarSaldo() {
        System.out.println(this.saldo);
    }

    protected void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Saldo atualizado: " + this.saldo);
    }

    protected abstract void transferir(double valor);

    protected abstract void receberTransferencia(double valor);

    protected void enviarPix(double valor) {
        this.saldo -= valor;
        System.out.println("Saldo atualizado: " + this.saldo);
    }

    protected void receberPix(double valor) {
        this.saldo -= valor;
        System.out.println("Saldo atualizado: " + this.saldo);
    }
}
