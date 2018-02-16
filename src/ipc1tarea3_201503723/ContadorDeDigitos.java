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
public class ContadorDeDigitos {
    
    //Las propiedades son el numero que se ingresa y  el tamaño 
    int numero;
    int cantidaDeDigitos;
    Scanner entrada = new Scanner(System.in);

    /*Este metodo sirve para ingresar el numero*/
    public void IngresarNumeros() {
        System.out.println("\nIngresar Numero");
        this.numero = entrada.nextInt();
        /*se verifica que el numero este entre el rango 0 a mil y sino con el ciclo
        while se pide que lo repita*/
        if (numero >= 0 && numero <= 100000) {
        } else {
            while (numero < 0 || numero > 100000) {
                System.out.println("\nERROR: EL NUMERO NO SE ENCUENTRA EN EL RANGO DE 0 A 100000");
                System.out.println("INTENTE OTRA VEZ");
                this.numero = entrada.nextInt();
            }
        }
    }
    
    //este metodo realiza la impresion de digitos del numero ingresado
    public void MostrarNumeroDeDigitos(){
        int digitos = 0;
        /*mediante un bucle while se verifica que los numeros vaya siendo mayores
        a potencias con base 10 para determinar cuantos digitos tiene si la condicion
        de entrada del bucle no se cumple el exponente es la cantidad de digitos
        del numero, el metodo Math.pow(10, digitos) sirve para elevar a 10 con un 
        exponente llamado digitos*/
        while(this.numero >= (Math.pow(10, digitos))){
            digitos++;
        }
        System.out.println("\n" + this.numero + " tiene " + digitos + " digitos.");
    }
}
