public class PessoaFisica extends Pessoa {
  private int cpf;

  public int getCpf() {
    return cpf;
  }

  public void setCpf (int cpf) {
    this.cpf = cpf;
  }

  @Override
  public int documento() {
    return cpf;
  }
}
