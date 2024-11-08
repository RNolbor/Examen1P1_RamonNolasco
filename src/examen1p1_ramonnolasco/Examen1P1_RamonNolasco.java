/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_ramonnolasco;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Examen1P1_RamonNolasco {

    public static char[] crearCombinacion(int longitud) {
        Random random = new Random();
        char[] arreglo = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = (char) (random.nextInt(26) + 97); 
        }
        return arreglo;
    }

    public static char[] actualizarProgreso(char[] combinacion, char[] progreso, char letra) {
        for (int i = 0; i < combinacion.length; i++) {
            if (combinacion[i] == letra) {
                progreso[i] = letra;
            }
        }
        return progreso;
    }

    public static void descifrarCombinacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nivel de Dificultad");
        System.out.println("1) Facil");
        System.out.println("2) Medio");
        System.out.println("3) Dificil");

        int dificultad = scanner.nextInt();
        while (dificultad != 1 && dificultad != 2 && dificultad != 3) {
            System.out.println("Ingrese una dificultad valida");
            dificultad = scanner.nextInt();
        }

        int longitud = 0, intentos = 0;
        switch (dificultad) {
            case 1 -> {longitud = 6; intentos = 22;}
            case 2 -> {longitud = 8; intentos = 20; }
            case 3 -> {longitud = 10; intentos = 18;}
        }

        char[] combinacion = crearCombinacion(longitud);
        char[] progreso = new char[longitud];
        
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '-';
        }


        int nIntento = 1;
        boolean cadenaDescifrada = false;

        while (nIntento <= intentos && !cadenaDescifrada) {
            System.out.println("Intento " + nIntento + "/" + intentos);
            System.out.println("Su progreso: " + String.valueOf(progreso));
            System.out.print("Ingrese un caracter: ");
            char letra = scanner.next().charAt(0);
            progreso = actualizarProgreso(combinacion, progreso, letra);
            cadenaDescifrada = Arrays.equals(combinacion, progreso);
            nIntento++;
        }

        if (cadenaDescifrada) {
            System.out.println("Has descifrado la cadena: " + String.valueOf(combinacion));
        } else {
            System.out.println("No lograste descifrar la cadena, la cadena era: " + String.valueOf(combinacion));
        }
    }
    
    
        public static int[] llenarArreglo(int tamañoArreglo) {
        int[] arreglo2 = new int[tamañoArreglo];
        Random random = new Random();
        for (int i = 0; i < tamañoArreglo; i++) {
            arreglo2[i] = random.nextInt(100) +1;
        }
        return arreglo2;
    }
    
    
    
    
    public static void rotacionCircular(int[] arreglo2){
        Scanner scanner = new Scanner(System.in);   
        Random random = new Random();
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamañoArreglo = scanner.nextInt();
        while (tamañoArreglo <= 5){
            System.out.println("Ingrese un tamaño de arreglo mayor a 5");
            tamañoArreglo = scanner.nextInt();        
        }
        
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo2);
       
        
        
    }
    
  

    
    
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("1) Descifrar la combinacion");
            System.out.println("2) Rotacion circular de arreglos");
            System.out.println("3) Bono: Suma de binarios");
            System.out.println("4) Salir");

            int eleccion = scanner.nextInt();
            while (eleccion < 1 || eleccion > 4) {
                System.out.println("Ingrese una opcion valida");
                eleccion = scanner.nextInt();
            }

            switch (eleccion) {
                case 1:
                    
                    descifrarCombinacion();
                    
                    break;
                    
                case 2:
                    
                    rotacionCircular();
                    
                    break;
                    
                case 3:
                    
                    
                    
                    break;
                    
                case 4:
                    
                    menu = false;
                    break;
                    
            }
        }
    }

    private static void rotacionCircular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
