public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 1899, "pdf", "Garnier");
        Tese tese = new Tese("Redes Neurais em Imagens", 2015, "Físico", "Prof. Souza");
        MidiaDigital midia = new MidiaDigital("Aula de Java", 2020, "mp3");
        LivroDidatico didatico = new LivroDidatico("Cálculo I", 1890, "Físico", "LCT", "Matemática");

        // todos são ItemBiblioteca, então cabem no mesmo vetor
        ItemBiblioteca[] itens = { livro, tese, midia, didatico };

        ItemBiblioteca maisAntigo = itens[0];
        for (int i = 1; i < itens.length; i++) {
            if (itens[i].getAnoPubli() < maisAntigo.getAnoPubli()) {
                maisAntigo = itens[i];
            }
        }

        System.out.println("Item mais antigo da biblioteca:");
        maisAntigo.exibirItemBiblioteca();
    }
}