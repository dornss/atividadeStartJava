package atividadesJavaStart;

import java.util.Scanner;

public class atv008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duração em segundos: ");
        int duracao = sc.nextInt();

        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;

        System.out.printf("Duração formatada: %02d:%02d:%02d%n", horas, minutos, segundos);

        sc.close();
	}

}
