
/**
 *
 * @author conta
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado = 0;
    
    public QuartoHotel(int quarto, double diaria){
        numQuarto = quarto;
        situacao = false;
        valorDiaria = diaria;
    }
    public void reservar(int rg){
        situacao = true;
        numRG = rg;
    }
    public double liberar(int dias){
        double total;
        total = dias * valorDiaria;
        situacao = false;
        numRG = 0;
        totalFaturado += total;
        return(total);
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    public boolean getSituacao(){
        return situacao;
    }
    public int getNumQuarto(){
        return numQuarto;
    }
}
