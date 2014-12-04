package Boletin12;

public class Boletin12 {

    public static void main(String[] args) throws InterruptedException {

        Garaje coche1 = new Garaje();
        Garaje coche2 = new Garaje(new Coche(" 222222"));
        coche1.aparcar();

        coche2.aparcar();
        Thread.sleep(1000);// espera 10 segundos
        coche1.desaparcar();
        Thread.sleep(1000); // espera 1 segundo        
        coche2.desaparcar();
        coche1.factura();     //
        coche2.factura();

    }

}
