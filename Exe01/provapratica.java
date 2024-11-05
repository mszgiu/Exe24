import java.util.Scanner;

public class provapratica {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		double valor_carro = 0;
		double total_carro;

		System.out.println("Escreva o custo de fabrica do carro:");
		valor_carro = Scanner.nextDouble();

		total_carro = valor_carro * 0.28 + valor_carro * 0.45;

		System.out.printf("%3.fn"+"O custo final é: " + total_carro);
	}
}
