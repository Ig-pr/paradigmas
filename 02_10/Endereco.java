public class Endereco {

    protected String nomeRua;
    protected int numero;

    public Endereco() {
    }

    public Endereco(String nomeRua, int numero) {
        this.setNomeRua(nomeRua);
        this.setNumero(numero);
    }

    public void setNomeRua(String nomeRua) {
        if (nomeRua != NULL)
            this.nomeRua = nomeRua;
    }

    public void setNumero(int numero) {
        if (numero > 0)
            this.numero = numero;
    }

    public String getNomeRua()
    {
        return this.nomeRua;
    }

    public String getNumero()
    {
        return this.numero;
    }


}