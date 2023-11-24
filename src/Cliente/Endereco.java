package Cliente;

public class Endereco {
    protected String cep;
    protected String logradouro;
    protected String numeroResidencial;
    protected String bairro;
    protected String cidade;
    protected String estado;

    public Endereco(String cep, String logradouro, String numeroResidencial, String bairro, String cidade, String estado) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroResidencial = numeroResidencial;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
