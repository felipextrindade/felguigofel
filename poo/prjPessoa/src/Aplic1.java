
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.util.Scanner;

/**
 *
 * @author conta
 */
public class Aplic1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        PessoaFisica PFis;
        PessoaJuridica PJur;

        int ano, anoAt;
        double x;
        String cpf, cgc, nome;

        System.out.println("Digite o ano atual");
        anoAt = entrada.nextInt();

        System.out.println("Digite o nome da Pessoa Fisica");
        nome = entrada.next();
        System.out.println("Digite o cpf da Pessoa Fisica");
        cpf = entrada.next();
        System.out.println("Digite o ano de inscrição da Pessoa Fisica");
        ano = entrada.nextInt();
        PFis = new PessoaFisica(cpf, nome, ano);

        System.out.println("Digite a base da Pessoa Fisica");
        PFis.setBase(entrada.nextDouble());

        do {
            System.out.println("Digite uma compra da Pessoa Fisica(digite 0 para sair)");
            x = entrada.nextDouble();
            PFis.addCompras(x);
        } while (x != 0);

        System.out.println("Digite o nome da Pessoa Juridica");
        nome = entrada.next();
        System.out.println("Digite o cgc da Pessoa Juridica");
        cgc = entrada.next();
        System.out.println("Digite o ano de inscrição da Pessoa Juridica");
        ano = entrada.nextInt();
        PJur = new PessoaJuridica(cgc, nome, ano);

        System.out.println("Digite a taxa da Pessoa Juridica");
        PJur.setTaxaIncentivo(entrada.nextDouble());

        do {
            System.out.println("Digite uma compra da Pessoa Juridica(digite 0 para sair)");
            x = entrada.nextDouble();
            PJur.addCompras(x);
        } while (x != 0);

        System.out.println("Pessoa Fisica:"
                + "\nNome: " + PFis.getNome()
                + "\nAno de inscrição: " + PFis.getAnoInscricao()
                + "\nCPF: " + PFis.getCPF()
                + "\nBASE: " + PFis.getBase()
                + "\nBonus: " + PFis.calcBonus(anoAt)
                + "\nTotal de Compras: " + PFis.getTotalCompras() + "\n");

        System.out.println("Pessoa Juridica:"
                + "\nNome: " + PJur.getNome()
                + "\nAno de inscrição: " + PJur.getAnoInscricao()
                + "\nCGC: " + PJur.getCGC()
                + "\nTAXA: " + (PJur.getTaxaIncentivo()*100)
                + "\nBonus: " + PJur.calcBonus(anoAt)
                + "\nTotal de Compras: " + PJur.getTotalCompras() + "\n");
    }

}
