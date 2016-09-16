package fatec.poo.model;

/**
 *
 * @author 0030481513020 - Guilherme Pereira de Souza Del Rio Bertola
 */
public class FuncionarioHorista extends Funcionario {

    //declaração dos atributos especificos do funcionario horista
    private double ValHorTrab;
    private int QtdeHorTrab;

    // chamada ao método construtor da superclasse
    public FuncionarioHorista(int r, String n, String dta, double vht) {
        super(r, n, dta);
        ValHorTrab = vht;
    }

    //receber a quantidade de Horas trabalhadas para o calculo de salario bruto
    public void apontarHoras(int qht) {
        QtdeHorTrab = qht;
    }

    //Calculo do salario bruto especifico para o funcionario horista (polimorfismo)
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = ValHorTrab * QtdeHorTrab;
        return (SalBruto);
    }

    //calculo da gratificação - 7.5% do salario bruto
    public double calcGratificacao() {
        return (calcSalBruto() * 0.075);
    }

    //caculo do salario liquido com gratificação utilizando o calcSalLiquido da super classe funcionario
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
