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
public class Usuario {
    //se declara un vector de tipo string y se inicializa con 5 espacios
    String[] usuarios = new String[5];

    //Este metodo sirve para ingresar usuarios uno por uno
    public void IngresarUsuario() {
        //se declara un objeto de tipo scanner para realizar entradas
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nIngresar Usuario");
        
        //este ciclo for recorre cada usuario que hay que ingresar
        for (int i = 0; i < this.usuarios.length; i++) {
            System.out.println("\nIngresa al usuario " + (i + 1));
            //aqui se realiza la entrada del usuario
            this.usuarios[i] = entrada.nextLine();
            //se declara una variable de tipo int para llevar el control del ciclo while
            int contador = 0;
            //este ciclo while sirve para realizar comparaciones y validar que el usuario no exista
            /*Si el usuario ya existe la variable contador regresa a 0 para empezar
            el recorrido nuevamente y verificar que no se repita*/
            while(contador <i){
                //el metodo equalsIgnoreCase sirve para realizar comparaciones entre strings
                if(this.usuarios[i].equalsIgnoreCase(this.usuarios[contador])){
                    System.out.println("\nEL USUARIO YA EXISTE! INGRESE OTRO NOMBRE!");
                    usuarios[i] = entrada.nextLine();
                    contador =0;
                }else{
                    //si el usuario no se repite suma uno al contador para seguir con el recorrido
                    contador++;
                }    
            }
        }
    }
    
    public void MostrarUsuariosAscendente(){
        System.out.println("");
        /*este ciclo for se recorre al revez para imprimir los usuarios del ultimo
        ingresado hasta el primero que se ingreso*/
        for (int i = this.usuarios.length-1; i >= 0; i--) {
            System.out.println(this.usuarios[i]);
        }
    }
    
    /*este ciclo for se recorre ascendente para imprimir los usuarios desde el primero
        que se ingreso hasta el ultimo que se ingreso*/
    public void MostrarUsuariosDescendente(){
        System.out.println("");
        for (int i = 0; i < this.usuarios.length; i++) {
            System.out.println(this.usuarios[i]);
        }
    }

}
