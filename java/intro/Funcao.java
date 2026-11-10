import java.util.Scanner;

public class Funcao
{
    public static void main (String[] args)
    {
        Scanner entra = new Scanner(System.in);
        int num;
        System.out.print("Digite num: ");

        num = entra.nextInt();

        if(num >= 0 && num < 5)
        {
            System.out.println(num);
        }
        else if(num >= 5 && num < 10)
        {
            num = 2*num + 1;
            System.out.println(num);
        }
        else if(num >= 10)
        {
            num = num - 3;
            System.out.println(num);
        }

        entra.close();
    }
}