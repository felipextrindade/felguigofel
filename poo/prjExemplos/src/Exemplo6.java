public class Exemplo6 {
	public static void main (String[] args){
		int cont,soma=0;
		cont=1;
		do{
			soma+=cont;
			cont++;
		}while(cont<=100);
		System.out.println("A somatoria de 1 ate 100: " + soma);
	}
}