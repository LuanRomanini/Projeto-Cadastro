public class PessoaFisica implements Pessoa {
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
    private String cpf;

    public PessoaFisica(int id, String nome, String telefone, int idade, String endereco, String cidade, String estado, double salario, String nomePai, String nomeMae, String cpf) {
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
        this.cpf = cpf;
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

    public String getEstado() {
        return estado;
    }

    public double getSalario() {
        return salario;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }
}
