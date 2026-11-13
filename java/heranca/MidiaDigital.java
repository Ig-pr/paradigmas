public class MidiaDigital extends ItemBiblioteca {

    public MidiaDigital(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao, formato);
    }

    public void exibir() {
        super.exibirItemBiblioteca();
    }
}