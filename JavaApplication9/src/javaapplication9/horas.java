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
public class horas{
    public static void main (String [] args){
        int horas, minutos, segundos;
        Scanner lector= new Scanner (System.in);
        
        System.out.println("Ingrese horas (0-23): ");
        horas= lector.nextInt();
        
        System.out.println("Ingrese los minutos (0-59): ");
        minutos= lector.nextInt();
        
        System.out.println("Ingrese los segundos (0-59): ");
        segundos= lector.nextInt();
        
        if (horas<0 || horas>23 || minutos<0 || minutos>59 || segundos<0 || segundos>5912){
            System.out.println("Error: Variables fuera de rango");
         
        } else {
            segundos++;
            
            if (segundos==60){
                segundos= 0;
                minutos++;
                
                if (minutos==60){
                    minutos=0;
                    horas++;
                    
                    if (horas==24){
                        horas=0;
                    }    
                }
            }
            System.out.printf("La hora en el siguiente segundo es: %02d:%02d:%02d\n",horas, minutos,segundos);
            }
    }
}

