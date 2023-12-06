/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {

    public static void main(String[] args) {
        int operacion;
        String mensajeFinal = "";
        // contador que indica el número del tabla
        for (int i = 1; i <= 50; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            // el \n también podria ir al inicio
            mensajeFinal = String.format("%sTabla de multiplicar del"
                    + " número %d\n",
                    mensajeFinal, i);
            // se hace la tabla que se requiere
            for (int contador = 1; contador <= 12; contador++) {
                // operacion = el número que tenga i * el valor del contador
                operacion = i * contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal = String.format("%s%d x %d = %d\n",
                        mensajeFinal,
                        i,
                        contador,
                        operacion);
            }
            mensajeFinal = String.format("%s\n", mensajeFinal);
            // System.out.println("\n");
        } // termina for 01

        System.out.printf("%s", mensajeFinal);
    }
}
