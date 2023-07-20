package conversor_OOP;

public class Cotacao {
    private double cotacaoAtual;
    private double iof = 0.06;

    public Cotacao(double cotacaoAtual) {
        this.cotacaoAtual = cotacaoAtual;
    }

    public double converter(double dolaresComprados) {
        double dolaresReajustados = cotacaoAtual * (1 + iof) * dolaresComprados;
        return dolaresReajustados;
    }

    public double getCotacaoAtual() {
        return cotacaoAtual;
    }

    public void setCotacaoAtual(double cotacaoAtual) {
        this.cotacaoAtual = cotacaoAtual;
    }

    public double getIof() {
        return iof;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}