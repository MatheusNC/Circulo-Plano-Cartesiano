package planoCartesiano;

public class Circulo {
    private float raio;
    private Ponto ponto;

    public Circulo(float raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public void inflar(float valor) {
        this.raio += valor;
    }

    public void inflar() {
        this.raio += 1;
    }

    public void desinflar(float valor) {
        this.raio -= valor;
    }

    public void desinflar() {
        this.raio -= 1;
    }

    public Circulo(float raio) {
        Ponto ponto = new Ponto(0,0);
        this.raio = raio;
        this.ponto = ponto;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public void mover() {
        this.ponto.setX(0);
        this.ponto.setY(0);
    }

    public void mover(double valorX, double valorY) {
        this.ponto.setX(valorX);
        this.ponto.setY(valorY);
    }

    public void mover(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getAreaCirculo() {
        return 3.14 * (this.raio * this.raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio= " + raio +
                ", pontos= " + "X= " + ponto.getX() + " | Y= " + ponto.getY() +
                '}';
    }
}
