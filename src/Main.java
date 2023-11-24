import Cliente.ClienteModel;
import Cliente.Endereco;
import Conta.ContaCorrente;
import Conta.ContaModel;
import Conta.ContaPoupanca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco("99999-000", "Bobos", "zero", "alto alegre", "do futuro", "PA");
        ClienteModel clienteModel = new ClienteModel("Amélia Benardes", "000.000.000-00", "1923-01-02", endereco);

        ContaModel cc = new ContaCorrente(clienteModel);
        cc.depositar(100);
        cc.exibirExtrato();

        ContaModel cp = new ContaPoupanca(clienteModel);
        cp.exibirExtrato();

        cc.transferir(70, cp);

        cc.exibirExtrato();
        cp.exibirExtrato();
    }
}