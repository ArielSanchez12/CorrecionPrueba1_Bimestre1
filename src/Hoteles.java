public class Hoteles {
    private String nombre;

    public Hoteles(String nombre){
        this.nombre = nombre;
    }
    //Para crear objetos con valores nulos
    public Hoteles(){

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Modificar objetos (general)
    public void modHoteles(String nombre){
        this.nombre = nombre;
    }

    //Para imprimir los hoteles(objetos)
    public void imprimirHoteles(){
        System.out.println("Nombre del hotel: " + nombre);
    }

    //Cambiar valores a null
    public void modnull(){
        nombre = null;
        System.out.println("El nombre del hotel ha sido modificado a: " + nombre + "\n");
    }

}
