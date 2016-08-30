import java.util.Scanner;
/**
 *
 * @author 0030481513020
 */
public class Aplic1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ContaTelefonica objConta = new ContaTelefonica();
        
        System.out.println("Digite o Numero:");
        objConta.setNumero(entrada.nextInt());
        System.out.println("Digite o Tipo (1 - residencial / 2 - comercial):");
        objConta.setTipo(entrada.nextInt());
        System.out.println("Digite a Quantidade de Pulsos:");
        objConta.setPulso(entrada.nextInt());
        System.out.println("Digite o minuto de Interurbanos:");
        objConta.setInterurbano(entrada.nextInt());
        System.out.println("Digite a Quantidade de Despertadores:");
        objConta.setDespertador(entrada.nextInt());
        
        System.out.println("Numero: " + objConta.getNumero());
        System.out.println("Tipo: " + objConta.getTipo());
        System.out.println("Quantidade de Pulsos: " + objConta.getPulso());
        System.out.println("Minutos de interurbano: " + objConta.getInterurbano());
        System.out.println("Despertadores: " + objConta.getDespertador());
        System.out.println("Valor Final: R$" + objConta.calcValorConta());
    }
    
}