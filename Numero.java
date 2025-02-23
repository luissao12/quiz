/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Luis Fernando
 */
public class Numero {

    double positivos_Negativos[] = new double[6];
    Scanner sc = new Scanner(System.in);

    void registrar() {
        System.out.println("REGISTRANDO NUMEROS");
        double numero = 0;
        for (int i = 0; i < positivos_Negativos.length; i++) {
            System.out.println("Digite un numero: ");
            numero = sc.nextDouble();
            positivos_Negativos[i] = numero;

        }
        System.out.println("Datos guardados!");
    }

    void positivo_Negativo() {
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        for (int i = 0; i < positivos_Negativos.length; i++) {
            if (positivos_Negativos[i] > 0) {
                contadorPositivo++;
            } else if (positivos_Negativos[i] < 0) {
                contadorNegativo++;
            }
            {

            }

        }
        System.out.println("los numero positivos son:"+contadorPositivo);
        System.out.println("los numeros negativos son:"+contadorNegativo);
    }

    void menu() {
        int opcion;
        do {
            System.out.println("""
                           \n*****MENU DE OPCIONES*****
                           --------------------------
                           1. Rgistrar  numero
                           2. mostrar los numeros negativos y positivos
                          
                           3. salir
                           
                           Digite una opcion:
                           """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.registrar();
                    break;
                case 2:
                    this.positivo_Negativo();
                    break;
                case 3:
                    System.out.println("SALIENDO....");
                    break;

            }
        } while (opcion != 3);
    }

}
