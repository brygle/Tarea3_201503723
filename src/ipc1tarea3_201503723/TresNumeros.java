/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea3_201503723;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class TresNumeros {
    int numero1;
    int numero2;
    int numero3;
    Scanner entrada = new Scanner(System.in);
    
    public void IngresarTresNumeros(){
        System.out.println("\nIngrese el primer numero: ");
        this.numero1 = entrada.nextInt();
        System.out.println("\nIngrese el segundo numero: ");
        this.numero2 = entrada.nextInt();
        System.out.println("\nIngrese el tecer numero: ");
        this.numero3 = entrada.nextInt();   
    }
    
    public void MostrarOrdenados(){
        System.out.println("\nLos numeros de mayor a menor son: ");
        if(numero1>numero2&&numero1>numero3){
            System.out.println(numero1);
        }else if(numero2>numero1&&numero2>numero3){
            System.out.println(numero2);
        }else if(numero3>numero1&&numero3>numero2){
            System.out.println(numero3);
        }
        
        if(numero1>numero2&&numero1<numero3){
            System.out.println(numero1);
        }else if(numero1<numero2&&numero1>numero3){
            System.out.println(numero1);
        }else if(numero2>numero1&&numero2<numero3){
            System.out.println(numero2);
        }else if(numero2<numero1&&numero2>numero3){
            System.out.println(numero2);
        }else if(numero3>numero1&&numero3<numero2){
            System.out.println(numero3);
        }else if(numero3<numero1&&numero3>numero2){
            System.out.println(numero3);
        }
        
        if(numero1<numero2&&numero1<numero3){
            System.out.println(numero1);
        }else if(numero2<numero1&&numero2<numero3){
            System.out.println(numero2);
        }else if(numero3<numero1&&numero3<numero2){
            System.out.println(numero3);
        }
        
        
    
    }
    
}
