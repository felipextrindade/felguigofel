package fatec.poo.model;

/**
 *
 * @author conta
 */
//Classe pessoa juridica com herança de pessoa
public class PessoaJuridica extends Pessoa {

    //atributos de pessoa juridica
    private String CGC;
    private double TaxaIncentivo;

    //Construtor da Pessoa Juridica com cgc, nome e ano de inscricao
    public PessoaJuridica(String cgc, String n, int ano) {
        //construtor da superclasse
        super(n, ano);
        CGC = cgc;
    }

    /*
    Calculo de bonus
    multiplica-se a taxa a Taxa de Incentivo pelo Total das Compras
    e multiplica-se o resultado final pela diferença
    entre o valor do ano atual com o ano de Inscrição.
     */
    public double calcBonus(int anoatual) {
        return ((TaxaIncentivo * getTotalCompras()) * (anoatual - getAnoInscricao()));
    }

    // retorna o CGC
    public String getCGC() {
        return CGC;
    }

    //retorna a taxa de incentivo
    public double getTaxaIncentivo() {
        return TaxaIncentivo;
    }

    //atribui covertendo para a forma decimal a taxa de incentivo
    public void setTaxaIncentivo(double TaxaIncentivo) {
        this.TaxaIncentivo = TaxaIncentivo / 100;
    }

}
