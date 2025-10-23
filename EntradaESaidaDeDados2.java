import java.util.Scanner;
public class EntradaESaidaDeDados2{
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("informe um numero(inteiro): ");
		n = teclado.nextInt();
		System.out.printf("voce digitou: %d",n);
	}
}