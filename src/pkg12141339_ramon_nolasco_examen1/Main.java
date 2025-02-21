/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12141339_ramon_nolasco_examen1;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int eleccion;
        
        do{
            System.out.println("-----------MENU-----------");
            System.out.println("1) Indice Soledad vs Indice Popularidad");
            System.out.println("2) Plantas vs Zombies");
            System.out.println("3) Salir");
            System.out.println("Ingrese una opcion: ");
            
            eleccion = input.nextInt();
            input.nextLine();
            
            switch (eleccion){
                
                case 1: 
                    String numero = input.nextLine(); 
                    int[] digitos = convertirACadena(numero);
                    int[] sumas = new int[digitos.length];

                    calcularIndices(digitos, sumas);
    
                    int nMayor = sumas[0];
                    int nMenor = sumas[0];
                    int nSolitario = digitos[0];
                    int nPopular = digitos[0];
        
                    for (int i = 1 ; i < digitos.length;i++){
                        if (sumas[i] > nMayor){
                            nMayor = sumas[i];
                            nPopular = digitos[i];
                        }     
                    }
        
                    for (int i = 1 ; i < digitos.length ; i++){
                        if (sumas[i] < nMenor){
                            nMenor = sumas[i];
                            nSolitario = digitos[i];        
                        }
                    }   
        
                    System.out.println("El valor mas solitario es " + nSolitario + " con un indice de soledad de " + nMenor);
                    System.out.println("El valor mas popular es " + nPopular + " con un indice de popularidad de " + nMayor);
                    
                    break;
                    
                case 2: 
                    plantasVSzombies();
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
                    break;
            }
                  
        }while(eleccion != 3);
        
        
    }
    
    //METODOS EJERCICIO 1 - INDICE SOLEDAD VS INDICE POPULARIDAD
    
    public static void imprimirArreglo(int[] digitos, String numero){
        
        for (int i = 0; i < numero.length() ; i++){
            System.out.print("[" + digitos[i] + "]");
        }
    }
    
    public static int[] convertirACadena(String numero) {
        int[] digitos = new int[numero.length()];
        for (int i = 0; i < numero.length(); i++) {
            digitos[i] = Character.getNumericValue(numero.charAt(i));
        }
        return digitos;
    }

    public static void calcularIndices(int[] digitos, int[] sumas) {
        int n = digitos.length;
        for (int i = 0; i < n; i++) {
            int sumaTotal = 0;
            int vecinos = digitos[i]; 

            for (int j = 1; j <= vecinos; j++) {
                if (i - j >= 0) {
                    sumaTotal += digitos[i - j];
                } else {
                    sumaTotal += 0; 
                }
            }

            for (int j = 1; j <= vecinos; j++) {
                if (i + j < n) {
                    sumaTotal += digitos[i + j];
                } else {
                    sumaTotal += 0; 
                }
            }

            sumas[i] = sumaTotal;
        }
    }
    
    //METODOS EJERCICIO 2 - PLANTAS VS ZOMBIES
    
    public static void plantasVSzombies(){
        Scanner input = new Scanner(System.in);
        
        char[] A = new char[20];
        char[] B = new char[20];
        char[] C = new char[20];

        A[19] = 'Z';
        B[19] = 'Z';
        C[19] = 'Z';
        
        int[] vidas = {100,100,100};                    
        int[] posiciones = {19,19,19};
                
        int soles = 50; //AQUI EMPIEZA EN 50 COMO PRUEBA, PORQUE SINO SE QUEDA EN BUCLE XD 
        
        
        boolean juego = true;
        
        while(juego){
            
            System.out.println("Soles = " + soles);
            int opcion;
            if (soles < 50){
                System.out.println("Cediendo el turno...");
                opcion = 2;
            }else{
                System.out.println("Opciones de jugador");
                System.out.println("1 - Agregar Planta");
                System.out.println("2 - Ceder turno");
                System.out.println("Ingrese una opcion: ");
                opcion = input.nextInt();
            }
            input.nextLine();
            
            switch (opcion){
                
                case 1:
                    soles -= 50;
                    System.out.println("Ingrese la posicion de la planta: ");
                    String pos = input.nextLine();
                    
                    int fila = Character.getNumericValue(pos.charAt(0));
                    int columna = Character.getNumericValue(pos.charAt(2));
                    
                    switch (fila){
                        case 1:
                            A[columna] = 'P';
                            break;
                        case 2:
                            B[columna] = 'P';
                            break;
                        case 3:
                            C[columna] = 'P';
                            break;
                    }
                    imprimirJardin(A,B,C);
                    
                    break;
                    
                case 2: 
                    imprimirJardin(A,B,C);
                    soles += 25;
                    continue;
                    
                    
                default:
                    System.out.println("Ingrese opcion valida!");
                    soles -= 25;
                    break;
                    
            }
            soles += 25;
                  
        }
              
    }
    public static void imprimirJardin(char[]A, char[]B, char[]C){
        System.out.println("");
        System.out.print("A: ");
        for (int i = 0; i < A.length ; i++){
            System.out.print("[" + A[i] + "]"); 
        }
        System.out.println("");
        System.out.print("B: ");
        for (int i = 0; i < B.length ; i++){
            System.out.print("[" + A[i] + "]"); 
        }
        System.out.println("");
        System.out.print("C: ");
        for (int i = 0; i < C.length ; i++){
            System.out.print("[" + C[i] + "]"); 
        }
        System.out.println("");
        System.out.println("");
    }
  
}

