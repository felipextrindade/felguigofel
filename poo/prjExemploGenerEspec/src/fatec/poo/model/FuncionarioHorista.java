package fatec.poo.model;

/**
 *
 * @author felip
 */
//Criação da subclasse Funcionario Horista, que herda tudo da classe Funcionario
public class FuncionarioHorista extends Funcionario {

    private double ValHorTrab;
    private int QtdeHorTrab;

    //Metodo construtor de Funcionario Horista
    public FuncionarioHorista(int r, String n, String dta, double vht) {
        super(r, n, dta); //Chamada do metodo construtor da superclasse Funcionario
        ValHorTrab = vht;
    }

    //Set das horas trabalhadas
    public void apontarHoras(int qht) {
        QtdeHorTrab = qht;
    }

    //Metodo de calculo do salario bruto, implementado para a subclass Funcionario Horista
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = ValHorTrab * QtdeHorTrab;
        return (SalBruto);
    }
    
    public double calcGratificacao() {
        double Gratificacao;
        Gratificacao = calcSalBruto() * 0.075;
        return(Gratificacao);
    }
    
    //Implementação do polimorfismo, do metodo calSalLiq, já criado na Superclasse Funcionario, porém, na subclasse
    //Funcionario Horista esse metodo deve executar de outra forma
    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = super.calcSalLiquido() + calcGratificacao();
        return (SalLiq);
    }
}//Fim da classe Funcionario Horista
