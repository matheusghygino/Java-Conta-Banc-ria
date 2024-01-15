import java.util.Random;

public class ContaCorrente extends ContaBancaria {
    Random rand = new Random();
    private int upperbound = 10000;
    
    public  ContaCorrente (String nome){
        this.nome = nome;
        this.tipoDeConta = "Conta Corrente";
        this.id = rand.nextInt(upperbound);
        this.taxaDeTransferencia = 2.99;
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
