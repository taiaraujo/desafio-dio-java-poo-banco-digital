package Conta;

import Cliente.ClienteModel;

public abstract class ContaModel implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    ClienteModel clienteModel;

    public ContaModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
        this.agencia = ContaModel.AGENCIA_PADRAO;
        this.numeroConta = ContaModel.SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) throws Exception {
        if(valor <= 0)
            throw new Exception("Nenhum valor foi depositado.");
        this.saldo += valor;

    }
    @Override
    public void sacar(double valor) throws Exception {
        if(this.saldo <= 0)
            throw new Exception("A sua conta não possui saldo.");
        this.saldo -= valor;

    }
    @Override
    public void transferir(double valor, ContaModel contaDestino) throws Exception {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public void exibirInfosComuns() {
        System.out.printf("Agencia : %d%n", agencia);
        System.out.printf("Conta : %d%n", numeroConta);
        System.out.printf("Titular : %s%n", clienteModel.nome());
        System.out.printf("Saldo : %.2f%n", saldo);
    }

    public int agencia() {
        return this.agencia;
    }

    public int numeroConta() {
        return this.numeroConta;
    }

    public double saldo() {
        return this.saldo;
    }
}
