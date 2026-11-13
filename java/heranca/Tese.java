public class Tese extends ItemBiblioteca {
    private String orientador;

    public Tese(String titulo, int anoPubli, String formato, String orientador){
        super(titulo, anoPubli, formato);
        setOrientador(orientador);
    }

    public void setOrientador(String orientador){
        this.orientador = orientador;
    }

    public void exibirTese(){
        super.exibirItemBiblioteca();
        System.out.println("Te: " + orientador);
    }
}
