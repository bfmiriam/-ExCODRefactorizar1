package lovivido;

import javax.swing.JOptionPane;

/**
 * En esta clase se realizan los calculos
 *
 * @author mbacelofernandez
 */
public class Calculos {

    /**
     * En esta funcion se calculan los meses, dias y horas que vive una persona
     * cuyo nombre y edad pasamos por parametro
     *
     * @param nombre nombre de la persona de la que calcularemos lo vivido
     * @param edad edad de la persona introducida
     */

    public void calcularLoVivido(String nombre, String edad) {
        int mes;
        int dia;
        int hora;
        int años;

        años = Integer.parseInt(edad);

        mes = (años * 12);
        dia = (años * 365);
        hora = (dia * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
