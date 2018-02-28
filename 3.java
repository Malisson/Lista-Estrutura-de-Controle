import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int tab;
		int numeros = 0;
		System.out.println("Qual tabuada deseja ver em tela?");
		tab = leitor.nextInt();
		for  (numeros=1; numeros<=10; numeros++)
		System.out.println("Tabuada: "+ tab +" x "+ numeros + " = " + tab*numeros);
		}
}
