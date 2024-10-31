public class Teste {
  public static void main (String args[]) {
    PessoaFisica pessoa = new PessoaFisica();
    pessoa.setNome("Pedro");
    pessoa.setCpf(1234567890);
    imprimir(pessoa);

    PessoaJuridica profissional = new PessoaJuridica();
    profissional.setNome("João");
    profissional.setCnpj(987654321);
    imprimir(profissional);
  }

  public static void imprimir (Pessoa pessoa) {
    System.out.println("Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.documento());

  }
}
