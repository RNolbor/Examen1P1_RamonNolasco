/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12141339_ramon_nolasco_examen1;

/**
 *
 * @author ramon
 */
public class metodos {
    
    
    //METODO EJERCICIO 1
    
    public boolean palindroma(String palabra){
        
        if (palabra.length() % 2 == 0){
            //Radar, Rotor, Anilina, Apocopa, Arenera, Sopapos, Reconocer, Acurruca, Neuquén.
            String mitadI = "";
            for (int i = (palabra.length()/2)-1 ; i >= 0 ; i--){
                mitadI += palabra.charAt(i);
                
            }
            String mitadD = "";
            for (int j = (palabra.length()/2) ; j < palabra.length(); j++){
                mitadD += palabra.charAt(j);
            }
            if (mitadI.equalsIgnoreCase(mitadD)){
                return true;
            }else{
                return false;
            }
            
        }else{
            
            String mitadI = "";
            for (int i = ((palabra.length()-1)/2)-1 ; i >= 0 ; i--){
                mitadI += palabra.charAt(i);
            }
            String mitadD = "";
            for (int j = (palabra.length()+1)/2 ; j < palabra.length() ; j++){
                mitadD += palabra.charAt(j);
            }
            
            if (mitadI.equalsIgnoreCase(mitadD)){
                return true;
            }else{
                return false;
            }   
        }
    }
    
    //METODO EJERCICIO 2
  
    public String eliminarDuplicados(String cadena){
        String cadena2 = "";
              
        for (int c1 = 0; c1 < cadena.length(); c1++){
            boolean imprimir = false;
            for (int c2 = 0; c2 < cadena.length(); c2++){
                char letra1 = cadena.charAt(c1);
                char letra2 = cadena2.charAt(c2);
                String l1 = Character.toString(letra1);
                String l2 = Character.toString(letra2);
                
                if (l1.equalsIgnoreCase(l2)){
                    
                    break;
                }else{
                    imprimir = true; 
                }
                
            }
            if (imprimir){
                cadena2 += cadena.charAt(c1);
            }
            
        }
                
        
        
        return cadena2;
    } 
    
}
