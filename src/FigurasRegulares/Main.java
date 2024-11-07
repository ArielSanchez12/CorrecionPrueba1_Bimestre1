package FigurasRegulares;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        System.out.println("Ingrese el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());
        System.out.println("Ingrese el ancho del rectangulo: ");
        rectangulo.setAncho(scanner.nextDouble());
        System.out.println("Ingrese la altura del rectangulo: ");
        rectangulo.setAltura(scanner.nextDouble());
        System.out.println("Ingrese el radio del circulo: ");
        circulo.setRadio(scanner.nextDouble());
        System.out.println("Ingrese el lado del triangulo: ");
        triangulo.setLado(scanner.nextDouble());
        System.out.println("Ingrese la altura del triangulo: ");
        triangulo.setAltura(scanner.nextDouble());


        double areaCuadrado = cuadrado.calcularArea();
        double areaRectangulo = rectangulo.calcularArea();
        double areaCirculo = circulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();


        System.out.println("\nCuadrado:");
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
        System.out.println("Area: " + areaCuadrado);

        System.out.println("\nRectangulo:");
        System.out.println("Ancho: " + rectangulo.getAncho());
        System.out.println("Alto: " + rectangulo.getAltura());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("Area: " + areaRectangulo);

        System.out.println("\nCirculo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Area: " + areaCirculo);

        System.out.println("\nTriangulo:");
        System.out.println("Lado: " + triangulo.getLado());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Area: " + areaTriangulo);
        double sumaAreas = cuadrado.calcularArea() + rectangulo.calcularArea() + circulo.calcularArea() + triangulo.calcularArea();
        System.out.println("\nLa suma de las areas de todas las figuras es: " + sumaAreas);
    }
}