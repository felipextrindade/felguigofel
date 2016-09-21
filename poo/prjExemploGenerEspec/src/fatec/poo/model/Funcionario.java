package fatec.poo.model;

/**
 *
 * @author felip
 */
//Classe abstrata ou Superclasse, apresenta os metodos e atributos que serão comuns às demais subclasses
public abstract class Funcionario {

    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;

    //Metodo construtor do funcionário
    public Funcionario(int r, String n, String dta) {
        Registro = r;
        Nome = n;
        DtAdmissao = dta;
    }

    //Metodo abstrato que será comum às demais subclasses, porém, terão implementações diferentes(Polimosfismo)
    abstract public double calcSalBruto();
    
    //Set do cargo, 
    public void setCargo(String c) {
        Cargo = c;
    }

    //Calculo do desconto do salário dos funcionários
    public double calcDesconto() {
        double Desconto;
        Desconto = 0.10 * calcSalBruto();
        return (Desconto);
    }

    //Calculo do salario liquido, usando como base o salario bruto e o desconto
    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = calcSalBruto() - calcDesconto();
        return (SalLiq);
    }
      
    public int getRegistro() {
        return Registro;
    }
    
    public String getCargo() {
        return Cargo;
    }
    
    public String getNome() {
        return Nome;
    }
    
    public String getDtAdimissao() {
        return DtAdmissao;
    }
}//Fim da classe funcionario
