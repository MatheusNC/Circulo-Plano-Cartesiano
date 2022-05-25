package planoCartesiano;

public class ProgramaTeste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Ponto ponto = new Ponto(2, 8);
        System.out.println(circulo.toString());

        circulo.mover(ponto);
        circulo.inflar();
        System.out.println(circulo.toString());

        circulo.mover(10, 9);
        circulo.desinflar(4);
        System.out.println(circulo.toString());

        System.out.println("Area do círculo: "+ circulo.getAreaCirculo());
    }
}
