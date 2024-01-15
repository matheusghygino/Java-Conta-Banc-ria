import java.util.Random;

public class ContaPoupanca extends ContaBancaria {
    Random rand = new Random();
    private int upperbound = 10000;
    
    public  ContaPoupanca (String nome){
        this.nome = nome;
        this.tipoDeConta = "Conta Poupança";
        this.id = rand.nextInt(upperbound);
        this.taxaDeTransferencia = 4.99;
    }

    @Override
    public void transferir(double valor){       
        this.saldo -= valor + taxaDeTransferencia;
        System.out.println("Saldo atualizado: " + this.saldo);
    }

    @Override
    public void receberTransferencia(double valor) {
        this.saldo += valor - taxaDeTransferencia;
        System.out.println("Saldo atualizado " + this.saldo);
    }

    
}
