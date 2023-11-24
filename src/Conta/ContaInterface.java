package Conta;

public interface ContaInterface {
    void depositar(double valor) throws Exception;
    void sacar(double valor) throws Exception;
    void transferir(double valor, ContaModel conta) throws Exception;
    void exibirExtrato();
}
