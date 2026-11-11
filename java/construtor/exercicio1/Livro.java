public class Livro {
    private String titulo;
    private int ano;
    private Autor author;

    public Livro(String titulo, int ano, Autor author){
        setTitulo(titulo);
        setAno(ano);
        this.author = author;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getAno(){
        return this.ano;
    }

    public Autor getAutor(){
        return this.author;
    }

    public void exibirLivro(){
        System.out.println("Nome: " + getTitulo());
        System.out.println("ano: " + getAno());
        author.exibirAutor();
        
    }
}
