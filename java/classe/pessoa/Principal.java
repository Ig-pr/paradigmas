public class Principal {
    public static void main(String[] args) {


        Pessoa[] p = new Pessoa[2];

        p[1] = new Pessoa();
        p[1].dataNascimento(new Data(5, 13, 1900));
        p[1].setNome("Ada");
        p[1].calcularIdade(new Data(10, 11, 2026));
        p[1].getRetornarNome();
        p[1].exibirInfo();

        

    }
}