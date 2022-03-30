package Exc2;

public class Rendimento {

    private double rendimento;
    private double investimento;
    private int qtdMes;

    public Rendimento ( double rendimento, double investimento, int qtdMes ){

        this.investimento=investimento;
        this.rendimento=rendimento;
        this.qtdMes=qtdMes;

    public void setQtdMes (int qtdMes){
        this.qtdMes=qtdMes;
        }

    public void rendimentoB (){
        retorno double;
        for ( int i=1; i<= qtdMes; i ++){
         retorno = investimento * rendimento;
         investimento= invstimentp + retorno;

         System.out.printf(" Mes %2d | Exc2.Rendimento/Mes %.2f" ,i,investimento );
         System.out.printl (" ");
        }
    }
    }
}
