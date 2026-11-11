public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(){
    }
    
    public Autor(String nome){
        setNome(nome);
    }

    public Autor(String nome, String nacionalidade){
        setNome(nome);
        setNacionalidade(nacionalidade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void exibirAutor(){
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        
    }
}

