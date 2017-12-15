/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Este programa calculara los meses, dias y horas que ha vivido una persona que
 * introducimos por pantalla
 *
 * @author mbacelofernandez
 */
public class LoVivido {

    public static void main(String[] args) {
        /**
         * Tenemos las variables nombre y edad que guardaran dichos datos de la
         * persona y que pedimos por pantalla
         */
        String nombre, edad;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        /**
         * Instanciamos un objeto de la clase Calculos para calcular lo que ha
         * vivido la persona.
         */
        Calculos primerCalculo = new Calculos();

        /**
         * Llamamos a la funcion calcularLoVivido y le pasamos el nombre y la
         * edad de la persona
         */
        primerCalculo.calcularLoVivido(nombre, edad);

    }

}
