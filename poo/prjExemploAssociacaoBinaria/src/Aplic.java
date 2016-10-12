import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481511045
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#,##0.00");
        FuncionarioHorista FuncHo = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista FuncMes = new FuncionarioMensalista(2020, "Ana Beatriz", "11/11/1985", 2.5);
        FuncionarioComissionado FuncCom = new FuncionarioComissionado(3030, "Joao", "10/12/1975", 8.5);
               
        FuncHo.setCargo("Programador");
        FuncMes.setCargo("Aux. Administrativo");           
        FuncCom.setCargo("Vendedor");
        
        //estabelecer a associação binária 1..1 entre 
        //um(1) objeto Funcionario com um(1) objeto Departamento
        Departamento dep1 = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        FuncHo.setDepartamento(dep1);
	FuncCom.setDepartamento(dep2);
		
        System.out.println("O funcionario " + FuncHo.getNome() +
                           " trabalha no departamento " + FuncHo.getDepartamento().getNome() +
                           "\nO funcionario " + FuncCom.getNome() +
                           " trabalha no departamento " + FuncCom.getDepartamento().getNome());
        
        
		
		
        
        //estabelecer a associação binária 1..* entre 
        //um(1) objeto Departamento com um(1) ou mais (*)
        //objetos Funcionario
             
    }
}