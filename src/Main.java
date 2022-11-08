import Programa.Cliente;
import Programa.Conta;
import Programa.ContaCorrente;
import Programa.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente Luane = new Cliente();
        Luane.setNome("Luane");

        Conta cc = new ContaCorrente(Luane);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Luane);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}