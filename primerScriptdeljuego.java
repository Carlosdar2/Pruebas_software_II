
package juegonramdon;

import java.util.Random;
import java.util.Scanner;


public class JuegoNRamdon {

    public static void main(String[] args) {
        System.out.println("****Bienvenido a Adivina el numero*****");
        System.out.println("****Adivina el numero del 0 al 5*****");
        Random ram =  new Random(); 
        Scanner s = new Scanner(System.in);
        
        int rnumero = ram.nextInt(6);
        
        int temp = 0;
        while(temp == 0){
            
            System.out.println("*******Elige un numero del 0 al 5*********");
           int Nusuario = s.nextInt();
           if(Nusuario == rnumero){
               System.out.println("**********GANASTE**************");
               temp= 1;
           }else{
               System.out.println("*******No es el numero, intentalo de nuevo********");
           
           }
        
        
        }
        
        
    }
    
}
