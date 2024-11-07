package FigurasRegulares;

public class Circulo {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * (3.1415) * radio;
    }

    public double calcularArea() {
        return (3.1415)  * (radio * 2);
    }
}

