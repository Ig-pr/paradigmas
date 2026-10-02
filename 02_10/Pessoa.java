public class Pessoa{

    private String nome; 
    private String ocup;
    private Endereco end;
    private Data dataNasc;

    public Pessoa(){}
    public  Pessoa (String nome, String ocup, Endereco end, Data dataNasc)
    {
        this.setNome(nome);
        this.setOcup(ocup);
        this.setEnd(end);
        this.setDataNasc(dataNasc);
    }

    //*set
    public void setNome(String nome)
    {
        if(nome != NULL)
            this.nome = nome;
    }

    public void setOcup(String ocup)
    {
        if(ocup != NULL)
            this.ocup = ocup;
    }


    //get

}