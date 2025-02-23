/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Luis Fernando
 */
public class Temperatura {
    double temperaturas[]= new double[5];
    Scanner sc = new Scanner(System.in);
    
    void registrar(){
        System.out.println("REGISTRANDO TEMPERATURAS");
        double temperatura;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite la temperatura:");
            temperatura = sc.nextDouble();
            temperaturas[i]= temperatura;
            
        }
        System.out.println("Datos guardados!");
    }
    void promedio(){
        double suma=0;
        for (double temperatura:temperaturas){
            suma += temperatura;
            
        }
        double promedio=suma/temperaturas.length;
        System.out.print("El promedio de las temperaturas es"+"\n"+promedio);
    }
    void listarMayores(){
        System.out.println("LISTANDO TEMPERATURAS MAYORES A 15°");
        int contador =0;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i] >15){
                System.out.println(temperaturas[i]+"/");
                contador++;
            }
        }
        if(contador ==0){
            System.out.println("no hay temperatura mayor a 15°");
        }else{
         System.out.print("El total de temperaturasmayores a 15° son"+"\n"+contador);   
        }
        
    }
    void salir(){
        System.out.println("SALIENDO.....");
    }
    void buscar(){
         
        
        int bandera =0;
        System.out.println("BUSCAR TEMPERATURA ");
        System.out.println("Digite la cedula a buscar:");
        int temperaturaBuscar = sc.nextInt(); 
        int temperaturaGuardada=0;
        
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturaGuardada =(int) temperaturas[i];
            if(temperaturaBuscar == temperaturaGuardada){
                bandera=1;
                System.out.println("temperatura  encontrada!");
            }
        }
            if (bandera==0) {
              System.out.println("temperatura no encontrada...");
       }
        
    }
    void menu(){
        int opcion;
        do {
            System.out.println("""
                           \n*****MENU DE OPCIONES*****
                           --------------------------
                           1. Rgistrar  temperatura
                           2. obtener el promedio
                           3. imprimir las temperaturas mayores a 15°
                           4. salir
                           
                           Digite una opcion:
                           """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.registrar();
                    break;
                case 2:
                    this.promedio();
                    break;
                case 3:
                    this.listarMayores();
                    break;
                case 4:
                    this.salir();
                    break;

            }
        } while (opcion != 4);
    }
    
}
