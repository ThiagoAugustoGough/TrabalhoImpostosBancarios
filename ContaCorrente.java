public class ContaCorrente extends Conta implements Tributavel{

    public double calculaTributos(){
        return this.saldo * 0.01;
    }

    public void obterSaldo(){
            System.out.println("Saldo da conta Corrente: " + this.saldo);
    }
}
