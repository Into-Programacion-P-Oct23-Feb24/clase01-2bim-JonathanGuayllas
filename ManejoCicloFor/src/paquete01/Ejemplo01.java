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
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* usamos acumuladores para guardar los datos de ciclos repetitivos y 
       condicionales y poderlos presentar posteriormente al final de nuestro
       código
    */
    String cadena = "";
        for (int i = 1; i <= 10; i++) {
           cadena = String.format("%s%d", cadena, i); 
        }
        
        for (int i = 1; i < 11; i++) {
          cadena = String.format("%s%d", cadena,i);
        }
    System.out.printf("%s",cadena); 
    }

}
