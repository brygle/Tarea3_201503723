/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea3_201503723;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Menu {

    public void MenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n1. Usuarios");
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres numeros de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                MenuUsuarios();
                break;
            case 2:
                MenuContadorDeDigitos();
                break;
            case 3:
                MenuTresNumeros();
                break;
            case 4:
                System.out.println("promedio");
                break;
            case 5:
                exit(0);
                break;
        }
    }
    
    public void MenuUsuarios(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios ascendente");
        System.out.println("3. Mostrar Usuarios descendente");
        System.out.println("4. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                MenuPrincipal();
        }
    }
    
    public void MenuContadorDeDigitos(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar numero");
        System.out.println("2. Mostrar numero de digitos");
        System.out.println("3. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                break;
            case 2: 
                break;
            case 3: 
                MenuPrincipal();
        }
    }
    
    public void MenuTresNumeros(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar numeros");
        System.out.println("2. Mostrar ordenados");
        System.out.println("3. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                break;
            case 2: 
                break;
            case 3: 
                MenuPrincipal();
        }
    
    }

}
