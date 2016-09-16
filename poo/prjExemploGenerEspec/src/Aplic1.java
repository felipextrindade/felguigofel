
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481513020
 */
public class Aplic1 {

    public static void main(String[] args) {
        //instanciação da classe de formatação
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        //instanciando e inicializando um funcionario horista
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        //Setando a quantidade de horas trabalhadas
        funcHor.setCargo("gerente");
        funcHor.apontarHoras(90);
        //exibindo o nome, data, cargo, salario bruto , desconto e o salario liquido
        System.out.println("Nome             =>  " + funcHor.getNome());
        System.out.println("Registro         =>  " + funcHor.getRegistro());
        System.out.println("Data de Adimissão=>  " + funcHor.getDtAdmissao());
        System.out.println("Cargo            =>  " + funcHor.getCargo());
        System.out.println("Salario Bruto    =>  " + formato.format(funcHor.calcSalBruto()));
        System.out.println("Desconto         =>  " + formato.format(funcHor.calcDesconto()));
        System.out.println("Gartificação     =>  " + formato.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido  =>  " + formato.format(funcHor.calcSalLiquido()) + "\n");

        //instanciando e inicializando um funcionario Mensalista
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1011, "Jair Souza", "14/05/1988", 700);
        //Setando a quantidade de salarios ganhos
        funcMen.apontarSalarios(3);
        funcMen.setCargo("Estagiario");
        //exibindo o nome, data, cargo, salario bruto , desconto e o salario liquido
        System.out.println("Nome             =>  " + funcMen.getNome());
        System.out.println("Registro         =>  " + funcMen.getRegistro());
        System.out.println("Data de Adimissão=>  " + funcMen.getDtAdmissao());
        System.out.println("Cargo            =>  " + funcMen.getCargo());
        System.out.println("Salario Bruto    =>  " + formato.format(funcMen.calcSalBruto()));
        System.out.println("Desconto         =>  " + formato.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido  =>  " + formato.format(funcMen.calcSalLiquido())+"\n");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(1012, "Claudio Souza", "11/05/1998", 5);
        
        //Setando a quantidade de salarios ganhos
        funcCom.setSalBase(500);
        funcCom.setCargo("Cozinheiro");
        funcCom.addVendas(500);
        funcCom.addVendas(6745.25);
        //exibindo o nome, data, cargo, salario bruto , desconto e o salario liquido
        System.out.println("Nome             =>  " + funcCom.getNome());
        System.out.println("Registro         =>  " + funcCom.getRegistro());
        System.out.println("Data de Adimissão=>  " + funcCom.getDtAdmissao());
        System.out.println("Cargo            =>  " + funcCom.getCargo());
        System.out.println("Salario Base     =>  " + formato.format(funcCom.getSalBase()));
        System.out.println("Comissao         =>  " + formato.format((funcCom.getTaxaComissao()*100))+"%");
        System.out.println("Salario Bruto    =>  " + formato.format(funcCom.calcSalBruto()));
        System.out.println("Gratificaçâo     =>  " + formato.format(funcCom.calcGratificacao()));
        System.out.println("Desconto         =>  " + formato.format(funcCom.calcDesconto()));
        System.out.println("Salario Liquido  =>  " + formato.format(funcCom.calcSalLiquido()));

    }

}
