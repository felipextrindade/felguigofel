
package fatec.poo.model;

/**
 *
 * @author felipe
 */
//Criação da subclasse Funcionario Mensalista, que herda tudo da classe Funcionario
public class FuncionarioMensalista extends Funcionario {
    
    private double ValSalMin;
    private double NumSalMin;
    
    //Metodo construtor de Funcionario Mensalista
    public FuncionarioMensalista(int r, String n, String dta, double nsm) {
        super(r, n, dta); //Chamada ao metodo construtor da Superclasse Funcionario
        NumSalMin = nsm;
    }
    
    public void apontarValSalMin(double vsm) {
        ValSalMin = vsm;
    }
    
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = NumSalMin * ValSalMin;
        return(SalBruto);
    }
}
