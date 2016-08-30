public class Exemplo5 {
	public static void main (String[] args){
		int cont, soma=0;
		cont=1;
		while(cont<=100){
			soma+=cont;
			cont++;
		}
		System.out.println("A somatoria de 1 ate 100: " + soma);
	}
}