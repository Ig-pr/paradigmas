public class Data {
    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public void setAno(int ano) {
        if (ano >= 1) {
            this.ano = ano;
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    

    public int getAno() {
        return this.ano;
    }

    public int getMes() {
        return this.mes;
    }

    public int getDia() {
        return this.dia;
    }
}
