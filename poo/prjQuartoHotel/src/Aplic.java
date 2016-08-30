
import java.util.Scanner;


/**
 *
 * @author conta
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        QuartoHotel objQuarto = new QuartoHotel();
         int numero, opcao;
         int RG, dias;
         double valor, fatura;
         System.out.println("Digite o quarto:");
         numero = entrada.nextInt();
         System.out.println("Digite o valor da diaria:");
         valor = entrada.nextDouble();
         objQuarto.QuartoHotel(numero, valor);
         for(;;){
             Menu();
             opcao = entrada.nextInt();
             switch (opcao){
                 case 1:
                     if (objQuarto.getSituacao()){
                         System.out.println("---Quarto Ocupado!---");
                        }
                     else{
                         System.out.println("---Quarto Livre!---");
                     }
                     break;
                 case 2:
                     if (objQuarto.getSituacao()){
                         System.out.println("---Quarto Já Reservado!---");
                        }
                     else{
                         System.out.println("Digite o RG:");
                         RG = entrada.nextInt();
                         objQuarto.reservar(RG);
                     }
                     break;
                 case 3:
                     if (objQuarto.getSituacao()){
                         System.out.println("Digite a Quantidade de Dias:");
                         dias = entrada.nextInt();
                         objQuarto.liberar(dias);
                        }
                     else{
                         System.out.println("---Quarto Já Livre!---");
                     }
                     break;
                 case 4:
                     fatura = objQuarto.getTotalFaturado();
                     System.out.println("---Total faturado: R$" + fatura+" ---");
                     break;
                 case 5:
                     System.exit(0);
                     break;
                 default:
                     System.out.println("---Comando invalido!---");
             }
                          
         }
    }
    static void Menu(){
        System.out.println("\tHotel California");
        System.out.println("\tSuch a lovely place");
        System.out.println("\tSuch a lovely face\n");
        System.out.println("1 - Consultar Quarto");
        System.out.println("2 - Reservar Quarto");
        System.out.println("3 - Liberar Quarto");
        System.out.println("4 - Consultar Faturamento");
        System.out.println("5 - Sair/n/tDigite a Opção:\n\n");
        
    }
    
}
