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
public class universidad {
     public static void main (String [] args){
        double descuento=0, promedio, pension, pago;
        int contado;
        Scanner lector= new Scanner (System.in);
        
        System.out.println("Ingrese la pension base: ");
        pension= lector.nextDouble();
        
        System.out.println("Ingrese el promedio ponderado: ");
        promedio= lector.nextDouble();
        
        System.out.println("¿Pagará al contado? (1:Si/2:No): ");
        contado= lector.nextInt();
        
        if (promedio>=18 && promedio<=20){
            descuento= pension*0.20;
            
        }else if(promedio>=15 && promedio<=17.99){
            descuento= pension*0.10;
            
        }else if(promedio>=13 && promedio<=14.99){
            descuento=pension*0.05;
            
        }else{
            descuento= 0.0;
        }
        
        double bono=(contado==1)? (50):(0);
        pago= pension-descuento-bono;
        
        System.out.println("-------Desglose de matricula-------\n");
        System.out.printf("Descuento por promedio: %.2f\n",descuento);
        System.out.printf("Bono pago al contado: %.2f\n",bono);
        System.out.printf("Monto final a pagar: %.2f\n",pago);
        
        }
        
    }



