/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_ramonnolasco;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author ramon
 */
public class Examen1P1_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public int[] crearCombinacion(int longitud){
        int[] arreglo = new int[longitud];
        arreglo[1] = 10;
        return arreglo;
    }
    
    public static void descifrarCombinacion (){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nivel de Dificultad");
        System.out.println("1) Facil");
        System.out.println("2) Medio");
        System.out.println("3) Dificil");
        
        int dificultad = scanner.nextInt();
        
        while (dificultad != 1 && dificultad != 2 && dificultad != 3){
            System.out.println("Ingrese una dificultad valida");
            dificultad = scanner.nextInt();
        }
        
        int longitud;
        int intentos;
        switch (dificultad){           
            case 1:
                longitud = 6;
                intentos = 22;
                break;               
            case 2:               
                longitud = 8;  
                intentos = 20;
                break;               
            case 3:                
                longitud = 10;
                intentos = 18;
                break;                
        }
        
        char c = (char)76;
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean menu = true;
        
        do {
            System.out.println("1) Descifrar la combinacion");
            System.out.println("2) Rotacion circular de arreglos");
            System.out.println("3) Bono: Suma de binarios");
            System.out.println("4) Salir");
            
            int eleccion = scanner.nextInt();
            while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4){
                System.out.println("Ingrese una opcion valida");
                eleccion = scanner.nextInt();
            }
            
            switch (eleccion){
                
                case 1:
                    
                    descifrarCombinacion();
                    
                    break;
                
                case 2:
                    
                    
                    
                    break;
                
                case 3:
                    
                    
                    
                    break;
                    
                case 4:
                    
                    menu = false;
                    break;
                
            }
            
        } while(menu == true);
        
        
    }
    
}
