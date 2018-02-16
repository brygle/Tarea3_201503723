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
    //las propiedades de esta clase son los 3 numeros a ingresar
    int numero1;
    int numero2;
    int numero3;
    Scanner entrada = new Scanner(System.in);
    
    //Este metodo sirve para ingresar los tres numeros 
    public void IngresarTresNumeros(){
        System.out.println("\nIngrese el primer numero: ");
        this.numero1 = entrada.nextInt();
        System.out.println("\nIngrese el segundo numero: ");
        this.numero2 = entrada.nextInt();
        System.out.println("\nIngrese el tecer numero: ");
        this.numero3 = entrada.nextInt();   
    }
    
    //este metodo sirve para mostrar los numeros ordenados de mayor a menor
    public void MostrarOrdenados(){
        System.out.println("\nLos numeros de mayor a menor son: ");
        
        //en este primer bloque se compara para buscar el numero mayor
        if(numero1>numero2&&numero1>numero3){
            System.out.println(numero1);
        }else if(numero2>numero1&&numero2>numero3){
            System.out.println(numero2);
        }else if(numero3>numero1&&numero3>numero2){
            System.out.println(numero3);
        }
        
        //en este segundo bloque se compara para buscar el segundo numero mayor
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
        
        //en este tercer bloque se compara para buscar el numero menor
        if(numero1<numero2&&numero1<numero3){
            System.out.println(numero1);
        }else if(numero2<numero1&&numero2<numero3){
            System.out.println(numero2);
        }else if(numero3<numero1&&numero3<numero2){
            System.out.println(numero3);
        }
    }
    
}
