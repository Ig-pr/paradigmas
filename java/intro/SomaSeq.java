import java.util.Scanner;

public class SomaSeq
{
    public static void main (String[] args)
    {
        Scanner coisa = new Scanner(System.in);
        int num;
        System.out.print("Digite num: ");

        num = coisa.nextInt();

        int result = 0;
        while(num != -1)
        {
            result = result + num;
            System.out.print("Digite num: ");
            num = coisa.nextInt(); 
        }

        System.out.print("A soma é " + result);
        coisa.close();
    }
}