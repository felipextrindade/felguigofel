
import fatec.poo.model.FuncionarioHorista;
import java.text.DecimalFormat;


/**
 *
 * @author 0030481513020
 */
public class Aplic1 {

    public static void main(String[] args) {
        //instanciação da classe de formatação
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        //instamciando e inicializando um funcionario horista
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        //Setando a quantidade de horas trabalhadas
        funcHor.apontarHoras(90);
        //exibindo o salario bruto , desconto e o salario liquido
        System.out.println("Salario Bruto    =>  " + formato.format(funcHor.calcSalBruto()));
        System.out.println("Desconto         =>  " + formato.format(funcHor.calcDesconto()));
        System.out.println("Salario Liquido  =>  " + formato.format(funcHor.calcSalLiquido()));
        
    }

}
