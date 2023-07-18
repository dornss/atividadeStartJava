package conversor;

public class Cotacao {
	public double cotacaoAtual;
	public double iof = 0.06;
	
	public double converter(double dolaresComprados) {
		double dolaresReajustados = cotacaoAtual * (1 + iof) * dolaresComprados ;
		//double dolaresFinal = dolaresReajustados * cotacaoAtual;
		return dolaresReajustados;
	} 
}