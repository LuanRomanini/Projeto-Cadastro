import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private List<Pessoa> pessoas;

    public CadastroPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void inserirPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return this.pessoas;
    }

    public void gerarAumento() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() <= 20) {
                pessoa.setSalario(pessoa.getSalario() * 1.1);
            } else if (pessoa.getIdade() <= 30) {
                pessoa.setSalario(pessoa.getSalario() * 1.15);
            } else {
                pessoa.setSalario(pessoa.getSalario() * 1.2);
            }
        }
    }

    public void imprimirDados() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("ID: " + pessoa.getId());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Telefone: " + pessoa.getTelefone());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Endereço: " + pessoa.getEndereco());
            System.out.println("Cidade: " + pessoa.getCidade());
            System.out.println("Estado: " + pessoa.getEstado());
            System.out.println("Salário: " + pessoa.getSalario());
            System.out.println("Nome do Pai: " + pessoa.getNomePai());
            System.out.println("Nome da Mãe: " + pessoa.getNomeMae());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
            }
            System.out.println("--------------------");
        }
    }
}
