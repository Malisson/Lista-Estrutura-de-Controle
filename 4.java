import java.util.Scanner;

public class Aumento {
	public static void main(String[] args) {
		Scanner leitor= new Scanner (System.in);
		int q = 100;
		int sal;
		int s;
		String nome= "nome";
		String fim= "fim";
		while(nome!=fim) {
		System.out.println("Insira o seu nome");
		nome = leitor.nextLine();
		if(nome==fim) {
				System.exit(0);
		}
		else {
			System.out.println("Insira o valor do seu salário");
			sal = leitor.nextInt();
			if (sal < 500) {
			s= sal * 20/100 + sal;
			System.out.println("Seu salário agora será -->" + s);
			break;
		}else {
				System.out.println(" Seu salário não terá reajuste");
			break;
	}	
	}
	}
	}
	}
