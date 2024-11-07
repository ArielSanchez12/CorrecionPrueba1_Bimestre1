package FigurasRegulares;

public class Triangulo {
    private double lado;
    private double altura;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularArea() {
        return (lado*altura)/2;
    }
}
