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
        metodos metodo = new metodos();
        
        
        int eleccion;
        
        do{
            System.out.println("-------------MENU--------------");
            System.out.println("1) Palabras Palindromas");
            System.out.println("2) Eliminar duplicados");
            System.out.println("3) Conversion de numeros romanos");
            System.out.println("4 Salir");
            
            eleccion = input.nextInt();
            input.nextLine();
            
            switch (eleccion){
                case 1: 
                    System.out.println("Ingrese la palabra: ");
                    String palabra = input.nextLine();
                    
                    boolean palindroma = metodo.palindroma(palabra);
                    
                    if (palindroma == true){
                        System.out.println(palabra + " es una palabra Palindroma!");
                    }else{
                        System.out.println(palabra + " no es una palabra Palindroma! ");
                    }
                      
                    break;
                
                case 2: 
                    System.out.println("Ingrese la cadena: ");
                    
                    String cadena = input.nextLine();
                    String cadena2 = metodo.eliminarDuplicados(cadena);
                    
                    System.out.println(cadena2);
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                               
            }
            
        }while(eleccion != 4);
        
        
        
        
        
    }
    
}
