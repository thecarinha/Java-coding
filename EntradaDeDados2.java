import java.util.Scanner;
public class EntradaDeDados2{
public static void main(String[]args){
Scanner teclado = new Scanner(System.in);
int n;
System.out.println("digite um numero: ");
n = teclado.nextInt();
System.out.printf("\nvoce digitou: %d",n);
}
}