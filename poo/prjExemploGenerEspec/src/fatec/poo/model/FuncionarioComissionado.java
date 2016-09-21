
package fatec.poo.model;

/**
 *
 * @author felip
 */
public class FuncionarioComissionado extends Funcionario {
    private double SalBase;
    private double TaxaComissao;
    private double TotalVendas;

    public FuncionarioComissionado(int r, String n, String dta, double tc) {
        super(r, n, dta);
        TaxaComissao = tc;
        TotalVendas = 0;
    }

    public double getSalBase() {
        return SalBase;
    }

    public void setSalBase(double sb) {
        SalBase = sb;
    }

    public double getTaxaComissao() {
        return TaxaComissao;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }
    
    public double calcSalBruto() {
        return(SalBase + (getTotalVendas() * (getTaxaComissao()/100)));
    }
    
    public double calcGratificacao() {
        double Gratificacao = 0;
        if (TotalVendas > 10000)
            Gratificacao = 0.05 * calcSalBruto();
        else if (TotalVendas <= 5000)
            Gratificacao = 0;
        else
            Gratificacao = 0.035 * calcSalBruto();
        return(Gratificacao);
    }
    
    public double calcPorcentGrat() {
        double Porcentagem = 0;
        if (TotalVendas > 10000)
            Porcentagem = 5;
        else if (TotalVendas <= 5000)
            Porcentagem = 0;
        else
            Porcentagem = 3.5;
        return(Porcentagem);
    }
    
    public void addVendas(double vendas) {
        TotalVendas =+ vendas;
    }
    
    public double calcSalLiq() {
        return(super.calcSalLiquido() + calcGratificacao());
    }
    
    
    
}
