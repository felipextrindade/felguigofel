//Caminho da classe
package fatec.poo.model;

/**
 *
 * @author conta
 */
//Clase Pessoa Fisica com Herança de Pessoa
public class PessoaFisica extends Pessoa {

    //Atributos CPF e Base(utilizada no calculo de bonus)
    private String CPF;
    private double Base;

    //Construtor da pessoa fisica com cpf, nome, e ano de inscricao
    public PessoaFisica(String cpf, String n, int ano) {
        //construtor da superclasse
        super(n, ano);
        CPF = cpf;
    }

    /*
    calculo do salario base
    parametro: ano atual (aaaa)
    caso o total de compras ultrapasse 12000
    a diferença do ano atual com o de inscrição
    será multiplicado pela base para calcular o bonus
     */
    public double calcBonus(int anoatual) {
        if (getTotalCompras() > 12000) {
            return ((anoatual - getAnoInscricao()) * Base);
        } else {
            return 0;
        }
    }

    //retorna o cpf
    public String getCPF() {
        return CPF;
    }

    //retorna a base
    public double getBase() {
        return Base;
    }

    //atribui um valor a base
    public void setBase(double Base) {
        this.Base = Base;
    }

}
