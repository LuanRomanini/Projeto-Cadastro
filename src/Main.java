public class Main {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();

        PessoaFisica pf1 = new PessoaFisica(1, "João Silva", "99999-9999", 25,
                "Rua das Flores, 123", "São Paulo", "SP", 3000.0, "José Silva", "Maria Silva",
                "123.456.789-00");
        PessoaFisica pf2 = new PessoaFisica(2, "Maria Souza", "88888-8888", 18,
                "Rua dos Cravos, 456", "Rio de Janeiro", "RJ", 2000.0, "Marcos Souza", "Ana Souza",
                "987.654.321-00");
        PessoaJuridica pj1 = new PessoaJuridica(3, "Empresa Espelhada", "77777-7777", 35,
                "Av. Paulista, 987", "São Paulo", "SP", 10000.0, "Silva", "Maria",
                "00000000/0001-99");
        PessoaJuridica pj2 = new PessoaJuridica(4, "Empresa Peruibe", "66666-6666", 28,
                "Av. Atlântica, 654", "Rio de Janeiro", "RJ", 8000.0, "Marcos Souza", "Ana de Souza Melo de Souza",
                "1111111111111111111/0001-11");

        cadastro.inserirPessoa(pf1);
        cadastro.inserirPessoa(pf2);
        cadastro.inserirPessoa(pj1);
        cadastro.inserirPessoa(pj2);

        System.out.println("Antes do aumento:");
        cadastro.imprimirDados();

        cadastro.gerarAumento();

        System.out.println("Depois do aumento:");
        cadastro.imprimirDados();
    }
}
