
import java.util.Scanner;



/**
 *
 * @author 0030481513020
 */
public class Aplic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno matAluno[] = new Aluno[3];
        int x, qntReprovados=0, qntMedia=0;
        double soma =0 , media;
        for (x=0;x<matAluno.length;x++){
            matAluno[x]= new Aluno();
            System.out.println("\nDigite o RA:");
            matAluno[x].setRA(entrada.nextInt());
            System.out.println("Digite a Nota da Prova 1:");
            matAluno[x].setNtPrv1(entrada.nextDouble());
            System.out.println("Digite a Nota da Prova 2:");
            matAluno[x].setNtPrv2(entrada.nextDouble());
            System.out.println("Digite a Nota do Trabalho 1:");
            matAluno[x].setNtTrab1(entrada.nextDouble());
            System.out.println("Digite a Nota do Trabalho 2:");
            matAluno[x].setNtTrab2(entrada.nextDouble());
            if (!(matAluno[x].isAprovado())){
                qntReprovados++;
            }
            soma += matAluno[x].calcMediaFinal();
        }
        media = soma/matAluno.length;
        for (x=0;x<matAluno.length;x++){
            if (matAluno[x].calcMediaFinal()>media){
                qntMedia++;
            }
        }
        System.out.println("Reprovados: "+qntReprovados);
        System.out.println("Aprovados: "+(matAluno.length-qntReprovados));
        System.out.println("media : "+media);
        System.out.println("acima da media: "+qntMedia);
        System.out.println("abaixo da media: "+(matAluno.length-qntMedia));
    }
    
}
