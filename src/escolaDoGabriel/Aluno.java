package escolaDoGabriel;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double media;
	
	public void calculaMedia() {
		media = (this.nota1 + this.nota2 + this.nota3)/3;
		double faltante = 60 - media;
		
		if(media >= 60) {
			System.out.println("Aprovado");
		} else		
			System.out.printf("Reprovado%nFaltou %.1f pontos", faltante);
	}
}
