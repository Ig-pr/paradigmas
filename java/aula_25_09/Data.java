public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
    }

    public void setAno(int ano) {
        if (ano >= 0)
            this.ano = ano;
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