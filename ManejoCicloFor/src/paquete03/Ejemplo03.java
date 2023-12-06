/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        int edad;
        double estatura;
        // la cadena acumula listado de jugadores
        String cadenaA = "Listado de jugadores\n";      
        
        System.out.println("Ingrese la cantidad de jugadores a ingresar");
        int limite = entrada.nextInt();
        entrada.nextLine();
        
        for (int contador = 1; contador <= limite; contador++) {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            cadenaA = String.format ("%s%d. %s -%s-, edad %d, estatura"
                    + " %.2f\n",
                    cadenaA,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura); 
        }
        System.out.printf(cadenaA);
    }
}
