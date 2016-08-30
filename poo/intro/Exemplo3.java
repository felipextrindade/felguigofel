public class Exemplo3 {
	public static void main (String[] args){
		int Numero;
		Numero = (int) (Math.random()*100);
		if (Numero > 50){
			System.out.println(Numero + " eh maior que 50");
		}
		else{
			System.out.println(Numero + " eh menor ou igual que 50");
		}
	}
}