import java.util.Scanner;

public class Principal{

  public static void main (String[] args)
  {

    Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Digite um número: ");

    num = input.nextInt();
    System.out.println("Número digitado: " + num);

    input.close();
  }
}
