public class App {
    public static void main(String[] args){
        
        ContaCorrente cc1 = new ContaCorrente("Matheus Gomes");


        String string = String.format("""
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %s
                """, cc1.getNome(), cc1.getTipoDeConta(), cc1.getSaldo());

        System.out.println(string);
        System.out.println(cc1.getId());
        cc1.setTaxaDeTransferencia(4);
        System.out.println(cc1.getTaxaDeTransferencia());


    }
}
