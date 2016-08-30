public class Exemplo7 {
	public static void main (String[] args){
		int tabnum[];
		int i,numero,soma=0;
		tabnum = new int[10];
		for(i=0;i<10;i++){
			numero = (int) (Math.random()*1000);
			tabnum[i] = numero;
			soma += numero;
			System.out.println("Valor " + (i+1) + ": " + tabnum[i]);
		}
		System.out.println("Somatorio: " + soma);
	}
}