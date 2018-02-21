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
    
    
    /*Este es el menu principal que se encarga de dirigir los procesos del 
    programa hacia otros submenus, dentro de cada case se utilizo un ciclo while
    para que cuando se termine de realizar la operacion regrese al submenu que 
    le corresponde*/
    public void MenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n1. Usuarios");
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres numeros de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:{
                while(true){
                    MenuUsuarios();
                }
            }
            case 2:
                while(true){
                    MenuContadorDeDigitos();
                }
            case 3:
                while(true){
                    MenuTresNumeros();
                }
            case 4:
                while(true){
                    MenuCalcularPromedio();
                }
            case 5:
                exit(0);
                break;
        }
    }
    
    /*se crea una referencia de tipo Usuario fuera del metodo para que podamos
    ingresar a el desde afuera, este menu de usuarios nos dirige hacia otras
    funcionalidades, en el case 1 al ingresar usuarios se crean instancias nuevas
    de clase Usuario y solamente ahi si el objeto ya existe no se vuelve a 
    instanciar nuevamente y si intentamos mostrar los usuarios ascendente
    o descendentemente sin antes ingresar usuarios nos manda error*/
    Usuario usuario = null;
    public void MenuUsuarios(){     
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios ascendente");
        System.out.println("3. Mostrar Usuarios descendente");
        System.out.println("4. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                if(this.usuario==null){
                    this.usuario = new Usuario();
                    this.usuario.IngresarUsuario();
                }else{
                    this.usuario.IngresarUsuario();
                }
                break;
            case 2:
                if(usuario!=null){
                    this.usuario.MostrarUsuariosAscendente();
                }else{
                    System.out.println("ERROR! NO HA INGRESADO USUARIOS");
                }
                break;
            case 3:
                if(usuario!=null){
                    this.usuario.MostrarUsuariosDescendente();
                }else{
                    System.out.println("ERROR! NO HA INGRESADO USUARIOS");
                }
                break;
            case 4: 
                MenuPrincipal();
                break;
        }
    }
    
    /*se crea una referencia de tipo ContadorDeDigitos fuera del metodo para que podamos
    ingresar a el desde afuera, este menu de contador de digitos nos dirige hacia otras
    funcionalidades, en el case 1 al ingresar el numero se crean instancias nuevas
    de clase ContadorDeDigitos y solamente ahi y si intentamos mostrar la cantidad 
    de digitos sin antes ingresarlo nos manda error*/
    ContadorDeDigitos contador = null;
    public void MenuContadorDeDigitos(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar numero");
        System.out.println("2. Mostrar numero de digitos");
        System.out.println("3. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                this.contador = new ContadorDeDigitos();
                this.contador.IngresarNumeros();
                break;
            case 2: 
                if(contador!=null){
                    this.contador.MostrarNumeroDeDigitos();
                }else{
                    System.out.println("ERROR! NO HA INGRESADO EL NUMERO A EVALUAR");
                }
                break;
            case 3: 
                MenuPrincipal();
                break;
        }
    }
    
    /*se crea una referencia de tipo TresNumeros fuera del metodo para que podamos
    ingresar a el desde afuera, este menu de tres digitos de mayor a menor nos 
    dirige hacia otras funcionalidades, en el case 1 al ingresar el numero se crean 
    instancias nuevas de clase ContadorDeDigitos y solamente ahi y si intentamos 
    mostrar los numeros sin antes inicializar el objeto nos manda error*/
    TresNumeros tres = null;
    public void MenuTresNumeros(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar numeros");
        System.out.println("2. Mostrar ordenados");
        System.out.println("3. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                this.tres = new TresNumeros();
                this.tres.IngresarTresNumeros();
                break;
            case 2: 
                if(tres!=null){
                    this.tres.MostrarOrdenados();
                }else{
                    System.out.println("ERROR! NO SE HAN INGRESADO LOS TRES NUMEROS");
                }
                break;
            case 3: 
                MenuPrincipal();
                break;
        }
    }
    /*se crea una referencia de tipo CalcularPromedio fuera del metodo para que podamos
    ingresar a el desde afuera, este menu de calcular promedios nos dirige hacia otras
    funcionalidades, en el case 1 al ingresar los datos se crean instancias nuevas
    de clase ContadorDeDigitos y solamente ahi y si intentamos mostrar los datos de
    usuarios sin antes inicializar el objeto nos manda error*/
    CalcularPromedio calcular = null;
    public void MenuCalcularPromedio(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n1. Ingresar datos de estudiantes");
        System.out.println("2. Mostrar tabla de datos");
        System.out.println("3. Menu Principal");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                this.calcular = new CalcularPromedio();
                this.calcular.IngresarDatos();
                break;
            case 2: 
                if(calcular!=null){
                    this.calcular.MostrarNotas();
                }else{
                    System.out.println("ERROR! NO SE HAN INGRESADO LOS DATOS DE ALUMNOS");
                }
                break;
            case 3: 
                MenuPrincipal();
                break;
        }
    }
}
