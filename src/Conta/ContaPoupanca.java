package Conta;

import Cliente.ClienteModel;

public class ContaPoupanca extends ContaModel{
    public ContaPoupanca(ClienteModel clienteModel) {
        super(clienteModel);
    }

    @Override
    public void exibirExtrato() {
        System.out.println(" ==== EXTRATO CONTA POUPANCA ====");
        exibirInfosComuns();
    }
}
