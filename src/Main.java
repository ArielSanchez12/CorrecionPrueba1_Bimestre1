public class Main {
    public static void main(String[] args) {
        Hoteles hotel1 = new Hoteles("hotel1");
        Hoteles hotel2 = new Hoteles("hotel2");
        Hoteles hotel3 = new Hoteles("hotel3");
        Hoteles hotel4 = new Hoteles("hotel4");
        Hoteles hotel5 = new Hoteles("hotel5");

        Hoteles hotelNull1 = new Hoteles();
        Hoteles hotelNull2 = new Hoteles();

        hotelNull1.setNombre("Null1");
        hotelNull2.setNombre("Null2");

        hotel1.modHoteles("Nuevo hotel 1");

        hotel2.imprimirHoteles();

        hotel3.modnull();
        hotel4.modnull();
        hotel5.modnull();
    }
}