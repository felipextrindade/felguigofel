
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
        /*Criação do ponteiro de um objeto PFis da subclasse PessoaFisica
        e um objeto PJur da subclasse PessoaJuridica*/
        PessoaFisica PFis;
        PessoaJuridica PJur;

        /*Declaração de variais do tipo int para ano de inscrição e anoAt para
        ano atual*/
        int ano, anoAt;
        double x;
        /*Declaração de variaveis do tipo Sring, CPF, Cadastro Geral de Contribuinte
        e Nome da pessoa*/
        String cpf, cgc, nome;

        System.out.println("Digite o ano atual");
        anoAt = entrada.nextInt();

        System.out.println("Digite o nome da Pessoa Fisica");
        nome = entrada.next();
        System.out.println("Digite o cpf da Pessoa Fisica");
        cpf = entrada.next();
        System.out.println("Digite o ano de inscrição da Pessoa Fisica");
        ano = entrada.nextInt();
        
        /*Instanciação do objeto criado, usando o metodo construtor*/
        PFis = new PessoaFisica(cpf, nome, ano);

        System.out.println("Digite a base da Pessoa Fisica");
        PFis.setBase(entrada.nextDouble());
        
        /*Adicionando compras para o PFis, digitando 0, o loop se encerra*/
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
        
        /*Instanciação do objeto criado, usando metodo construtor*/
        PJur = new PessoaJuridica(cgc, nome, ano);

        System.out.println("Digite a taxa da Pessoa Juridica");
        PJur.setTaxaIncentivo(entrada.nextDouble());

        /*Adicionando compras para o PJur, digitando 0, o loop se encerra*/
        do {
            System.out.println("Digite uma compra da Pessoa Juridica(digite 0 para sair)");
            x = entrada.nextDouble();
            PJur.addCompras(x);
        } while (x != 0);

        /*Imprimindo todos os dados de PFis*/
        System.out.println("Pessoa Fisica:"
                + "\nNome: " + PFis.getNome()
                + "\nAno de inscrição: " + PFis.getAnoInscricao()
                + "\nCPF: " + PFis.getCPF()
                + "\nBASE: " + PFis.getBase()
                + "\nBonus: " + PFis.calcBonus(anoAt)
                + "\nTotal de Compras: " + PFis.getTotalCompras() + "\n");

        /*Imprimindo todos os dados de PJur*/
        System.out.println("Pessoa Juridica:"
                + "\nNome: " + PJur.getNome()
                + "\nAno de inscrição: " + PJur.getAnoInscricao()
                + "\nCGC: " + PJur.getCGC()
                + "\nTAXA: " + (PJur.getTaxaIncentivo()*100)
                + "\nBonus: " + PJur.calcBonus(anoAt)
                + "\nTotal de Compras: " + PJur.getTotalCompras() + "\n");
    }

}
