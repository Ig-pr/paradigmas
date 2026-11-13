public class Livro extends ItemBiblioteca {
    protected String editora;

    public Livro(String titulo, int anoPubli, String formato, String editora){
        super(titulo, anoPubli, formato);
        setEditora(editora);
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public String getEditora(){
        return this.editora;
    }

    public void exibirLivro(){
        super.exibirItemBiblioteca();
        System.out.println("Ed: " + editora);
    }
}
