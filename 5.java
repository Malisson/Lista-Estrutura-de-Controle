import java.util.Scanner;

public class gasolina {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		float l;
		float r;
		System.out.println("Quantos litros foram gastos?");
		l = leitor.nextInt();
		r = l * 25/10 + 6;
		System.out.println("Total da Conta --> R$"+r);
	}

}
