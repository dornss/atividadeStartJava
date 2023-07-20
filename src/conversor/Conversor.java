package conversor;
import java.util.Locale;
import java.util.Scanner;


public class Conversor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
			Scanner sc = new Scanner(System.in);
			
			Cotacao cotacao = new Cotacao();
			
			System.out.println(cotacao);
			
			System.out.println("Digite a cotação atual: ");	
			cotacao.cotacaoAtual = sc.nextDouble();
			
			System.out.println("Quantos dólares serão comprados?");
			double dolaresComprados = sc.nextDouble();
			
			System.out.printf("%.2f", cotacao.converter(dolaresComprados));

			
			sc.close();
	}
}
