public class PrincipalBook {
    public static void main(String[] args) {
        Autor a1 = new Autor("Jose", "Marroquino");
        a1.exibirAutor();

        Livro l1 = new Livro("Loucuras", 2026, new Autor("Jas", "brasileiro"));
        l1.exibirLivro();
    }
}
