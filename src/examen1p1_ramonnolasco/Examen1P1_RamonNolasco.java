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
    public static char[] crearCombinacion(int longitud){
        Random random = new Random();
        char[] arreglo = new char[longitud];
        arreglo[1] = 10;
        for (int i = longitud ; i > 0 ; i -= 1){
            int e = 0;
            arreglo[e] = (char) ((char)random.nextInt(25) + 97);
            e += 1;
        }
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
        
        int longitud = 0;
        int intentos = 0;
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
        
        char[] arregloProgreso = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            arregloProgreso[i] = '-';
        }

        char[] combinacion = crearCombinacion(longitud);
        int nIntento = 1;
        boolean cadenaDescifrada = false;
        
        while (nIntento <= intentos || cadenaDescifrada == true){           
            System.out.println("Intento " + nIntento + "/" + intentos);
            System.out.println("Su progreso: " + Arrays.toString(arregloProgreso));
            System.out.println("Ingrese un caracter: ");
            char letra = scanner.next().charAt(0);
            
            for ( int y = longitud ; y > 0 ; y -= 1){
                int l = 0;
                for (int z = longitud ; z > 0 ; z -= 1){
                    if (combinacion[l] == letra){
                        arregloProgreso[l] = letra;
                    }
                    l += 1;
                }
                    
            }
            
            nIntento += 1;
        }
        if (cadenaDescifrada == true){
            System.out.println("Has descifrado la cadena: " + Arrays.toString(combinacion));
        }
        else{
            System.out.println("No lograste descifrar la cadena, la cadena era: " + Arrays.toString(combinacion));
        }
        
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
