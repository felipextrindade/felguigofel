//Caminho da classe
package fatec.poo.model;

/**
 *
 * @author 0030481513020
 */
// intanciação da classe Pessoa, com os parametros: Nome , Ano de inscrição e Total de compras
public abstract class Pessoa {

    private String Nome;
    private int AnoInscricao;
    private double TotalCompras = 0;

    //Construtor do classe (apenas recebe nome e ano)
    public Pessoa(String n, int ano) {
        Nome = n;
        AnoInscricao = ano;
    }

    //Adiciona uma compra ao total de compras
    public void addCompras(double compra) {
        TotalCompras += compra;
    }

    //retorna ano de inscrição
    public int getAnoInscricao() {
        return AnoInscricao;
    }

    //retorna nome
    public String getNome() {
        return Nome;
    }

    //retorna o total de compras
    public double getTotalCompras() {
        return TotalCompras;
    }

    //Metodo abstrato que será comum às demais subclasses, porém, terão implementações diferentes(Polimosfismo)
    abstract public double calcBonus(int anoatual);

}
