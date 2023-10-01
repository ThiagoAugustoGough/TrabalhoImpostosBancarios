// Classe principal!!
public class TestaTributavel {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        cc1.depositar(443.6);
        cp1.depositar(564.2);
        cc1.sacar(45.6);
        cp1.sacar(24.5);

        cp1.obterSaldo();
        cc1.obterSaldo(); //tudo certo com metodos sacar e depositar

        System.out.println("Tributo conta corrente: " + cc1.calculaTributos());

    }
}