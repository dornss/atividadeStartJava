package atividadesJavaStart;
import java.util.Scanner;

public class atv001 {

	public static void main(String[] args) {
		//Terceira questão
		/*ler as medidas da largura e comprimento de um
		terreno retangular com uma casa decimal, bem como o valor do metro quadrado
		do terreno com duas casas decimais. Em seguida, o programa deve mostrar o
		valor da área do terreno, bem como o valor do preço do terreno, ambos com
		duas casas decimais, conforme exemplo*/
		
		Scanner sc = new Scanner(System.in);
		
		String p1, p2;
		int i1, i2, media;
		
		System.out.println("Insira o nome da primeira pessoa: ");
		p1 = sc.nextLine();
		
		System.out.println("Insira a idade da primeira pessoa: ");
		i1 = sc.nextInt();
		sc.nextLine();//Comando pra debugar a linha (não entendi)
		
		
		System.out.println("Insira o nome da segunda pessoa: ");
		p2 = sc.nextLine();
		
		System.out.println("Insira a idade da segunda pessoa: ");
		i2 = sc.nextInt();
		
		media = (i1+i2)/2;
		
		System.out.printf("Dados da primeira pessoa: %nNome: %s%nIdade: %d%nDados da segunda pessoa: %nNome: %s%nIdade: %d%n", p1,i1,p2,i2);
		System.out.printf("A idade média de %s e %s é: %d", p1, p2, media);
		
		sc.close();
	}

}
