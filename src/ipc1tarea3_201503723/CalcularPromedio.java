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
public class CalcularPromedio {
    //se declara e instancia un arreglo bidimensional de 6x6 para datos de estudiantes
    int datos[][] = new int[6][6];
    Scanner entrada = new Scanner(System.in);
    
    public void IngresarDatos(){
        int i;
        //se recorre el ciclo for para pedir los datos de cada estudiante uno por uno
        for(i = 0; i<datos.length;i++){
            System.out.println("\n Ingrese el id del estudiante " + (i+1));
            datos[i][0] = entrada.nextInt();
            System.out.println("\n Ingrese la 1er nota del estudiante " + (i+1));
            datos[i][1] = entrada.nextInt();
            System.out.println("\n Ingrese la 2da nota del estudiante " + (i+1));
            datos[i][2] = entrada.nextInt();
            System.out.println("\n Ingrese la 3er nota del estudiante " + (i+1));
            datos[i][3] = entrada.nextInt();
            System.out.println("\n Ingrese 4ta nota del estudiante " + (i+1));
            datos[i][4] = entrada.nextInt();
            datos[i][5] = (datos[i][1]+datos[i][2]+datos[i][3]+datos[i][4])/4;
        }
    
    }
    
    /*este metodo muestra los datos y el promedio de cada estudiante*/
    public void MostrarNotas(){
        int i,j;
        System.out.println("");
        System.out.println("ID\tNOTA 1\tNOTA 2\tNOTA3\tNOTA4\tPROMEDIO\n" );
        //el primer bucle sirve para recorrer por cada estudiante
        for(i=0;i<6;i++){
            //el segundo bucle sirve para recorrer por cada dato del estudiante
            for(j=0;j<6;j++){
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println("");
        
        }
    }
    
}
