package Boletin12;

import javax.swing.JOptionPane;

public class Garaje {

    static final int plazas = 5;
    static int numCoches = 0;
    private long tempo;
    private long temInicial, temFinal;
    private Coche coche;

    public Garaje() {
        coche = new Coche();
    }

    public Garaje(Coche co) {
        coche = new Coche();
        coche = co;
    }

    public boolean plazas() {
        boolean ocupado = false; // non hai plazas
        if (numCoches < plazas) {
            ocupado = true;
        }

        return ocupado;
    }

    //  long temInicial,temFinal;

    public void aparcar() {
        if (plazas()) {
            JOptionPane.showMessageDialog(null, "quedan :" + (plazas - numCoches));
            coche.setMatricula(JOptionPane.showInputDialog(" matricula :"));
            temInicial = System.currentTimeMillis();
            numCoches++;
            System.out.println(" tInicial : " + temInicial);

        }
    }

    public void desaparcar() {
        temFinal = System.currentTimeMillis();
        numCoches--;
        System.out.println(" TFinal : " + temFinal);
    }

    public void tempoTotal() {
        tempo = temFinal - temInicial;
    }

    public float calcularPrecio() {
        tempoTotal();

        return (((int) (tempo / 3) - 1) * 0.2f + 0.4f);
    }

    public void factura() {

        JOptionPane.showMessageDialog(null, " ****  FACTURA****\n" + " MATRICULA -----" + coche.getMatricula() + "\n tempo :" + (temFinal - temInicial) / 1000 + "segundos" + "\n precio---" + calcularPrecio());
    }

}
