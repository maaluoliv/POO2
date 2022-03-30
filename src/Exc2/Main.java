package Exc2;
import java.util.Scanner;
    public class Main {
        public static void Main ( String [] args){

        Scanner Scan = new Scanner(System.in) ;

        double porcentRendimento = 0.0;
        double investimento = 0.0;
        int qtdMes = 0;

        System.out.println(" Informe o seu rendimento: ");
        porcentRendimento = Scan.nextDouble();

        porcentRendimento = porcentRendimento/ 100;

        System.out.println(" Informe quanto foi investido: ");
        investimento = Scan.nextDouble();

        System.out.println(" Inform quantos meses o dinheiro ficou no fundo de investimento:");
        qtdMes = Scan.nextInt();

        Rendimento rendimento = new Rendimento (porcentRendimento, investimento, qtdMes);
        rendimento . rendimentoB();

        }
}
