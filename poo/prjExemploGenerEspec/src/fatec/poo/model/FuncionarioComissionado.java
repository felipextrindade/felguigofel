package fatec.poo.model;

/**
 *
 * @author 0030481513020
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase = 0;
    private double taxaComissao;
    private double totalVendas = 0;

    public FuncionarioComissionado(int r, String n, String dta, double Com) {
        super(r, n, dta);
        taxaComissao = (Com / 100);
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public void addVendas(double venda) {
        totalVendas += venda;
    }

    public double calcGratificacao() {
        double gratificacao = 0;
        if (totalVendas > 5000) {
            if (totalVendas > 10000) {
                gratificacao = 0.05 * totalVendas;
            } else {
                gratificacao = 0.035 * totalVendas;
            }
        }
        return gratificacao;
    }

    public double calcSalBruto() {
        double salBruto = 0;
        salBruto = salBase + (taxaComissao * totalVendas);
        return salBruto;
    }

    public double calcSalLiquido() {
        double salLiquido;
        salLiquido = calcSalBruto() - calcDesconto() + calcGratificacao();
        return salLiquido;
    }

}
