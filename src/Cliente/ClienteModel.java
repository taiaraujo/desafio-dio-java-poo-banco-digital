package Cliente;

import java.util.Date;

public class ClienteModel {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected Endereco endereco;

    public ClienteModel(String nome, String cpf, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String nome() {
        return nome;
    }

    public String cpf() {
        return cpf;
    }

    public String dataNascimento() {
        return dataNascimento;
    }

    public Endereco endereco() {
        return endereco;
    }
}
