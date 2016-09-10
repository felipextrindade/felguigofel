package fatec.poo.model;

/**
 *
 * @author 0030481513020 - Guilherme Pereira de Souza Del Rio Bertola
 */
    //classe abstrada funcionario
public abstract class Funcionario {
    
    //declaração dos atributos semelhantes a todos os tipo de funcionarios
    private int Registro;
    private String Nome;
    private String DtAdmissao;

    //construtor de funcionario
    public Funcionario(int r, String n, String dta) {
        Registro = r;
        Nome = n;
        DtAdmissao = dta;
    }

    //Abstração de calculo do salario bruto (assinatura), se alterará conforme a subclasse
    abstract public double calcSalBruto();

    // calculo do desconto do salario encima do bruto
    public double calcDesconto() {
        double Desconto;
        Desconto = 0.10 * calcSalBruto();
        return (Desconto);
    }

    // calculo do salario liquido, utilizando o salrio bruto e o desconto
    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = calcSalBruto() - calcDesconto();
        return (SalLiq);
    }
}
