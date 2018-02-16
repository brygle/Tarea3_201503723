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
    private String[] usuarios;
    
    public Usuario(){
        usuarios = new String[5];
    }
    
        Menu menu = new Menu();

    public void IngresarUsuario() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nIngresar Usuario");

        for (int i = 0; i < this.usuarios.length; i++) {
            System.out.println("\nIngresa al usuario " + (i + 1));
            this.usuarios[i] = entrada.nextLine();
            int contador = 0;
            
            while(contador <i){
                
                if(this.usuarios[i].equalsIgnoreCase(this.usuarios[contador])){
                    System.out.println("\nEL USUARIO YA EXISTE! INGRESE OTRO NOMBRE!");
                    usuarios[i] = entrada.nextLine();
                    contador =0;
                }else{
                    contador++;
                }    
            }
        }
    }
    
    public void MostrarUsuariosAscendente(){
        System.out.println("");
        for (int i = this.usuarios.length-1; i >= 0; i--) {
            System.out.println(this.usuarios[i]);
        }
    }
    public void MostrarUsuariosDescendente(){
        System.out.println("");
        for (int i = 0; i < this.usuarios.length; i++) {
            System.out.println(this.usuarios[i]);
        }
    }

}
