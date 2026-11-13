public class LivroDidatico extends Livro {
    private String disciplina;

    public LivroDidatico(String titulo, int anoPublicacao, String formato, String editora, String disciplina) {
        super(titulo, anoPublicacao, formato, editora);
        this.disciplina = disciplina;
    }

    public void exibir() {
        super.exibirItemBiblioteca();
        System.out.println("Disciplina: " + disciplina);
    }
}