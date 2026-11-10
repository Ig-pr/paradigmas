import java.util.Scanner;

public class Positivo
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite num: ");

        num = input.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("O num " + num + " é par");
        }
        else
        {
            System.out.println("O num " + num + " é ímpar");   
        }

        input.close();

    }
}