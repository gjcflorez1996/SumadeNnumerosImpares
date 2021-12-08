/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadenimpares;

import java.util.Scanner;

/**
 *
 * @author Phineas
 */
public class SumaDeNImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingresa número: ");
        numero = teclado.nextInt();
        
        int acumulador = 0;
        int s = 1;
        
        if(numero == 1){
            System.out.println("1");
        }
        else{
            for(int i=2;i<=numero;i++){
            s = s + 2;
            acumulador = acumulador + s;
        }
        int t = acumulador + 1;
        System.out.println("La suma es: " + t);
        }
    }
    
}
