import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		float opcao;
		float opcao2;
		float calculo;
		float r;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe o Sal�rio");
		opcao = leitor.nextInt();
		System.out.println("Qual a porcentagem de reajuste?");
		opcao2 = leitor.nextInt();
		calculo= opcao * opcao2/100;
		r= calculo + opcao;
		System.out.println("O aumento ser� de R$" + calculo);
		System.out.println("O valor do novo sal�rio ser� R$" + r);
		} 
}
