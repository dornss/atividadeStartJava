package atividadesJavaStart;
import java.util.Scanner;


public class atv003 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int produto;
		double preco, qtd, recebe, troco, subtotal;
		
		menu();
		
		produto = sc.nextInt();
		
		switch (produto) {
        case 1:
            preco = 5.00;
            break;
        case 2:
            preco = 3.00;
            break;
        case 3:
            preco = 0.50;
            break;
        default:
            System.out.println("Opção inválida.");
            sc.close();
            return;
    }
		
		System.out.println("Digite a quantidade que deseja comprar: ");
		qtd = sc.nextDouble();
		
		subtotal = qtd * preco;
		
		System.out.println("Quanto será recebido em dinheiro? ");
		recebe = sc.nextDouble();
		
		if(recebe < subtotal) {
			System.out.println("Dinheiro insuficiente para a compra.");
			sc.close();
			return;
		}
		
		
		troco = recebe - subtotal;

		
		System.out.printf("Preço unitário do produto: R$%.2f%nQuantidade comprada: %.0f%nDinheiro recebido: R$%.2f%nTROCO: R$%.2f", preco, qtd, recebe, troco);
		
		sc.close();
	}
	
	public static void menu(){		
		System.out.println("Digite o número do produto deseja consumir: ");
		System.out.println("1. Banana - R$5.00");
		System.out.println("2. Mamao - R$3.00");
		System.out.println("1. Laranja - R$0.50");	
	}
}