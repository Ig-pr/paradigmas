public class Pessoa {
    private String nome;
    private int idade;
    private Data nascimento;

    public void dataNascimento(Data nascimento){
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRetornarNome() {
        return this.nome;
    }

    public int getRetornarIdade() {
        return this.idade;
    }

    public void calcularIdade(Data atual) {
        int result;
        result = atual.getAno() - nascimento.getAno();
        if (atual.getMes() < nascimento.getMes()) {
            result = result - 1;
        } else if (atual.getMes() == nascimento.getMes() && atual.getDia() < nascimento.getDia()) {
            result = result - 1;
        }
        this.idade = result;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println(nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
    }
}