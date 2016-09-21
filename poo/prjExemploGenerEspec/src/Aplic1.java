
//Importação dos pacotes
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author felip
 */
public class Aplic1 {

    public static void main(String[] args) {
        //Instanciação e construção do objeto da classe DecimalFormat, numeros terão 2 casas depois da virgula,
        //e se não existir numeros a esquerda do zero da virgula, serão adicionados espaços.
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        //Instanciação e construção do objeto funchor da subclasse FuncionarioHorista
        FuncionarioHorista funchor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        funchor.setCargo("Programador");//Set do cargo, se encontra na Superclasse, evitando grandes alterações em outros arquivos
        FuncionarioMensalista funmens = new FuncionarioMensalista(1020, "Felipe Siqueira", "28/03/1979", 1.5);
        funmens.setCargo("Estagiário");
        FuncionarioComissionado funcomis = new FuncionarioComissionado(1030, "Guigo", "31/02/2007", 3);
        funcomis.setCargo("Chefe");
        funcomis.setSalBase(700);
        //Set das horas trabalhadas
        funchor.apontarHoras(90);
        funmens.apontarValSalMin(900);
        funcomis.addVendas(20000);
        
        //Chamada dos metodos da subclasse Funcionario Horista
        System.out.println("Funcionario Horista: " + funchor.getNome());
        System.out.println("Registro: " + funchor.getRegistro());
        System.out.println("Cargo: " + funchor.getCargo());
        System.out.println("Data de Adimissao: " + funchor.getDtAdimissao());
        System.out.println("Salario Bruto: " + formato.format(funchor.calcSalBruto()));
        System.out.println("Desconto: " + formato.format(funchor.calcDesconto()));
        System.out.println("Gratificacao: " + formato.format(funchor.calcGratificacao()));
        System.out.println("Salario Liquido: " + formato.format(funchor.calcSalLiquido()));
    
        //Chamada dos metodos da subclasse Funcionario Mensalista
        System.out.println("\nFuncionario Mensalista: " + funmens.getNome());
        System.out.println("Registro: " + funmens.getRegistro());
        System.out.println("Cargo: " + funmens.getCargo());
        System.out.println("Data de Adimissao: " + funmens.getDtAdimissao());
        System.out.println("Salario Bruto: " + formato.format(funmens.calcSalBruto()));
        System.out.println("Desconto: " + formato.format(funmens.calcDesconto()));
        System.out.println("Salario Liquido: " + formato.format(funmens.calcSalLiquido()));
        
        //Chamada dos metodos da subclasse Funcionario Comissionado
        System.out.println("\nFuncionario Comissionado: " + funcomis.getNome());
        System.out.println("Registro: " + funcomis.getRegistro());
        System.out.println("Cargo: " + funcomis.getCargo());
        System.out.println("Data de Adimissao: " + funcomis.getDtAdimissao());
        System.out.println("Salario Bruto: " + formato.format(funcomis.calcSalBruto()));
        System.out.println("Salario Base: " + formato.format(funcomis.getSalBase()));
        System.out.println("Taxa de Comissao: " + funcomis.getTaxaComissao() + "%");
        System.out.println("Desconto: " + formato.format(funcomis.calcDesconto()));
        System.out.println("Total de Vendas: " + formato.format(funcomis.getTotalVendas()));
        System.out.println("Gratificacao: " + formato.format(funcomis.calcGratificacao()));
        System.out.println("Porcentagem: " + funcomis.calcPorcentGrat()+ "%");
        System.out.println("Salario Liquido: " + formato.format(funcomis.calcSalLiq()));
    }
}
