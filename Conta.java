// Como nunca vamos criar um objeto tipo conta(sempre vamos especificar, tornei a classe abstrata)
public abstract class Conta {
    double saldo;

    public void sacar(double quantidade){
        if(quantidade > this.saldo){
            System.out.println("Quantidade invalida");
            return;
        }
        System.out.println("Sacando...");
        saldo -= quantidade;
    }
    public void depositar(double quantidade){
        System.out.println("Depositando...");
        saldo += quantidade;
    }

    public abstract void obterSaldo();
}
