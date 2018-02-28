import java.util.Scanner;

public class credito {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		float sal;
		float cre;
		float per;
		System.out.println("Digite o valor(bruto) do seu salário");
		sal = leitor.nextInt();
		System.out.println("Digite o valor de crédito desejado");
		cre = leitor.nextInt();
		per= sal*31/100;
		if (cre<per) {
		System.out.println("Credito Aprovado");
		} else {
		System.out.println("Credito Não Aprovado");
	}
	}
}
