import java.util.Scanner;

public class EhPar
{
    public static void main (String[] args)
    {
        Scanner coisa = new Scanner(System.in);
        int num;
        System.out.print("Digite num: ");

        num = coisa.nextInt();
        if(num > 0)
        {
            System.out.println(num + " é positivo");
        }
        else
        {
            System.out.println(num + " é negativo");
        }
        coisa.close();
        
    }
}