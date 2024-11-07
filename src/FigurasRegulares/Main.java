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

        //Conceptos:
        /*
        Clase:
        Una clase es como una plantilla donde se le pone atributos los cuales van a ser
        usados por los objetos, es decir un molde para los objetos.

        Objetos:
        Un objeto es una instancia de una clase que hereda todos o parte de los atributos
        de la clase.

        Constructor:
        Es un metodo de java que se usa para inicializar los atributos de una
        clase.

        Setters y Getters:
        Los getters y setters son métodos especiales en Java que se utilizan para
        acceder y modificar los valores de los atributos privados de una clase.

        Metodo:
        Son  las acciones que pueden realizar los objetos de una clase.
        */
    }
}