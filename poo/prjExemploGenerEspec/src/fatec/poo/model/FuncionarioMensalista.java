package fatec.poo.model;

/**
 *
 * @author 0030481513020
 */
public class FuncionarioMensalista extends Funcionario {

    private double ValSalMin;
    private int NumSalMin;
    //Construtor do mensalista
    public FuncionarioMensalista(int r, String n, String dta, double vsm) {
        super(r, n, dta);
        ValSalMin = vsm;
    }
    //receber a quantidade de salarios que recebemos
    public void apontarSalarios(int nsm) {
        NumSalMin = nsm;
    }
    //Calculo do salario bruto sem gratificação - assinado em funcionario
    public double calcSalBruto() {
        double salBruto;
        salBruto = ValSalMin * NumSalMin;
        return salBruto;
    }

}
