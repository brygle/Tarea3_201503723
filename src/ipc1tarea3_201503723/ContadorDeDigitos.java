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

    int numero;
    int cantidaDeDigitos;
    Scanner entrada = new Scanner(System.in);

    public void IngresarNumeros() {
        System.out.println("\nIngresar Numero");
        this.numero = entrada.nextInt();
        if (numero >= 0 && numero <= 100000) {
        } else {
            while (numero < 0 || numero > 100000) {
                System.out.println("\nERROR: EL NUMERO NO SE ENCUENTRA EN EL RANGO DE 0 A 100000");
                System.out.println("INTENTE OTRA VEZ");
                this.numero = entrada.nextInt();
            }
        }
    }
    
    public void MostrarNumeroDeDigitos(){
        int digitos = 0;
        while(this.numero >= (Math.pow(10, digitos))){
            digitos++;
        }
        System.out.println("\n" + this.numero + " tiene " + digitos + " digitos.");
    }
}
