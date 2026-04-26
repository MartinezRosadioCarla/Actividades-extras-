/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author CARLA
 */
public class dinero {
    public static void main (String []args){
        double soles, resultado=0;
        int opcion;
        String moneda= "";
        Scanner lector= new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de dinero en soles (PEN): ");
        soles= lector.nextDouble();
        
        System.out.println("1.Dolares americanos(USD)");
        System.out.println("2.Euros (EUR)");
        System.out.println("3.Libras Esterlinas (GBP)");
        System.out.println("4.Pesos mexicanos (MXN)");
        
        System.out.print("Elija la opcion: ");
        opcion= lector.nextInt();
        
        switch (opcion){
            case 1:
                resultado=soles*0.27;
                moneda="USD";
                break;
                
            case 2:
                resultado=soles*0.25;
                moneda="EUR";
                break;
                
            case 3:
                resultado=soles*0.21;
                moneda="GBP";
                break;
                
            case 4:
                resultado=soles*4.50;
                moneda="MXN";
                break;
                
            default:
                System.out.println("Moneda no disponible");
                return;
            
    }    
                
                System.out.printf("Resultado: %.2f Soles equivalen a %.2f %s\n",soles,resultado,moneda);
    }
}
