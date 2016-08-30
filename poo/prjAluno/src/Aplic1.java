
import java.util.Scanner;

/**
 *
 * @author 0030481513020
 */
public class Aplic1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Aluno objAluno = new Aluno();
        int RA;
        double nt1,nt2,trab1,trab2;
        
        System.out.println("Digite o RA:");
        RA = entrada.nextInt();
        System.out.println("Digite a Nota da Prova1:");
        nt1 = entrada.nextDouble();
        System.out.println("Digite a Nota da Prova 2:");
        nt2 = entrada.nextDouble();
        System.out.println("Digite a Nota do Trabalho 1:");
        trab1 = entrada.nextDouble();
        System.out.println("Digite a Nota do Trabalho 2:");
        trab2 = entrada.nextDouble();
        
        objAluno.setNtPrv1(nt1);
        objAluno.setNtPrv2(nt2);
        objAluno.setNtTrab1(trab1);
        objAluno.setNtTrab2(trab2);
        objAluno.setRA(RA);
        
        System.out.println("Prova 1: " + objAluno.getNtPrv1());
        System.out.println("Prova 2: " + objAluno.getNtPrv2());
        System.out.println("Trabalho 1: " + objAluno.getNtTrab1());
        System.out.println("Trabalho 2: " + objAluno.getNtTrab2());
        System.out.println("RA: " + objAluno.getRA());
        System.out.println("Media de Provas: " + objAluno.calcMediaProva());
        System.out.println("Media de Trabalhos: " + objAluno.calcMediaTrab());
        System.out.println("Media Final: " + objAluno.calcMediaFinal());
        
        if (objAluno.isAprovado()){
            System.out.println("Situação: Aprovado");
        }
        else{
            System.out.println("Situação: Reprovado");
        }
        
    }
    
}
