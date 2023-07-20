package escolaDoGabriel_OOP;

public class Aluno {
	 private String nome;
	    private double nota1;
	    private double nota2;
	    private double nota3;
	    private double media;

	    public Aluno() {
	 
	    }
	    
	    public Aluno(String nome, double nota1, double nota2, double nota3) {
	        this.nome = nome;
	        this.nota1 = nota1;
	        this.nota2 = nota2;
	        this.nota3 = nota3;
	    }

	    public void calculaMedia() {
	        media = (this.nota1 + this.nota2 + this.nota3) / 3;
	        double faltante = 60 - media;

	        if (media >= 60) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.printf("Reprovado%nFaltou %.1f pontos", faltante);
	        }
	    }
	    
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getNota1() {
	        return nota1;
	    }

	    public void setNota1(double nota1) {
	        this.nota1 = nota1;
	    }

	    public double getNota2() {
	        return nota2;
	    }

	    public void setNota2(double nota2) {
	        this.nota2 = nota2;
	    }

	    public double getNota3() {
	        return nota3;
	    }

	    public void setNota3(double nota3) {
	        this.nota3 = nota3;
	    }

	    public double getMedia() {
	        return media;
	    }
}
