public class PessoaJuridica implements Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private int idade;
    private String endereco;
    private String cidade;
    private String estado;
    private double salario;
    private String nomePai;
    private String nomeMae;
    private String cnpj;

    public PessoaJuridica(int id, String nome, String telefone, int idade, String endereco, String cidade, String estado, double salario, String nomePai, String nomeMae, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.salario = salario;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String getEstado() {
        return null;
    }

    @Override
    public double getSalario() {
        return 0;
    }

    @Override
    public String getNomePai() {
        return null;
    }

    @Override
    public String getNomeMae() {
        return null;
    }

    @Override
    public void setSalario(double novoSalario) {

    }

    public String getCnpj() {
        return null;
    }
}

