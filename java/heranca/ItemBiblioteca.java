public class ItemBiblioteca {
    protected String titulo;
    protected int anoPubli;
    protected String formato;

    public ItemBiblioteca(String titulo, int anoPubli, String formato){
        this.setTitulo(titulo);
        this.setAnoPubli(anoPubli);
        this.setFormato(formato);
    }

    public void setAnoPubli(int anoPubli){
        this.anoPubli = anoPubli;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setFormato(String formato){
        this.formato = formato;
    }

    public int getAnoPubli(){
        return this.anoPubli;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getFormato(){
        return this.formato;
    }

    public void exibirItemBiblioteca(){
        System.out.println("T: " + getTitulo());
        System.out.println("Ano: " + getAnoPubli());
        System.out.println("F: " + getFormato());
    }
}
