
import java.util.Scanner;


/**
 *
 * @author 0030481513020
 */
public class Aplic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         int numero, opcao, x;
         int RG, dias;
         double valor, fatura;
         
         QuartoHotel objQuarto[]=new QuartoHotel[10];
         for(x=0; x<objQuarto.length;x++){
            System.out.println("Digite o quarto:");
            numero = entrada.nextInt();
            System.out.println("Digite o valor da diaria:");
            valor = entrada.nextDouble();
            
            objQuarto[x] = new QuartoHotel(numero,valor);
         }
         for(;;){
             
             Menu();
             
             opcao = entrada.nextInt();
             switch (opcao){
                 case 1://Consultar quarto
                     
                     do{
                        System.out.println("Digite o numero do quarto:");
                        numero = entrada.nextInt(); 
                     }while(indice(numero,objQuarto)==-1);
                     x = indice(numero,objQuarto);
                     if (objQuarto[x].getSituacao()){
                         System.out.println("---Quarto Ocupado!---");
                        }
                     else{
                         System.out.println("---Quarto Livre!---");
                     }
                     break;
                 case 2://Reservar quarto
                     do{
                        System.out.println("Digite o numero do quarto:");
                        numero = entrada.nextInt(); 
                     }while(indice(numero,objQuarto)==-1);
                     x = indice(numero,objQuarto);
                     if (objQuarto[x].getSituacao()){
                         System.out.println("---Quarto Já Reservado!---");
                        }
                     else{
                         System.out.println("Digite o RG:");
                         RG = entrada.nextInt();
                         objQuarto[x].reservar(RG);
                     }
                     break;
                 case 3://Liberar Quarto
                     do{
                        System.out.println("Digite o numero do quarto:");
                        numero = entrada.nextInt(); 
                     }while(indice(numero,objQuarto)==-1);
                     x = indice(numero,objQuarto);
                     if (objQuarto[x].getSituacao()){
                         System.out.println("Digite a Quantidade de Dias:");
                         dias = entrada.nextInt();
                         System.out.println("---Valor a ser pago: R$" + objQuarto[x].liberar(dias)+"---");
                        }
                     else{
                         System.out.println("---Quarto Já Livre!---");
                     }
                     break;
                 case 4://Consultar faturamento
                     do{
                        System.out.println("Digite o numero do quarto:");
                        numero = entrada.nextInt(); 
                     }while(indice(numero,objQuarto)==-1);
                     x = indice(numero,objQuarto);
                     fatura = objQuarto[x].getTotalFaturado();
                     System.out.println("---Total faturado: R$" + fatura+" ---");
                     break;
                 case 5://Sair
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
        System.out.println("5 - Sair\n\tDigite a Opção:\n");
        
    }
    public static int indice(int numero,QuartoHotel objQuarto[]){
        int cont =-1;
        for (int x=0;x<objQuarto.length;x++){
            cont++;
            if (numero == objQuarto[x].getNumQuarto()){
                return cont;
            }
        }
        return (-1);
    }
}
