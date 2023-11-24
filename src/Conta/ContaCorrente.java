package Conta;

import Cliente.ClienteModel;

public class ContaCorrente extends ContaModel {

    public ContaCorrente(ClienteModel clienteModel) {
        super(clienteModel);
    }

    @Override
    public void exibirExtrato() {
        System.out.println(" ==== EXTRATO CONTA CORRENTE ====");
        exibirInfosComuns();
    }
}
