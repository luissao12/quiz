/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

public class Nota {

    double notas[] = new double[5];
    Scanner sc = new Scanner(System.in);

    void agregar() {
        System.out.println("REGISTRANDO NOTAS");
        double nota;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Dijite la nota: ");
            nota = sc.nextDouble();
            notas[i] = nota;

        }
        System.out.println("Datos guuardados!");
    }

    void listar() {
        System.out.println("LISTANDO NOTAS");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + "-");

        }
        System.out.println();
    }

    void promedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;
        System.out.println("El promedio de las notas es: " +"\n"+ promedio);

    }

    void listarMayores() {
        System.out.println("LISTANDO NOTAS MAYORES A 3");
        boolean bandera = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 3) {
                System.out.print(notas[i] + "/");
                bandera = true;

            }

        }
        if(!bandera){
            System.out.println("no hay notas mayores a 3");
        }
        System.out.println();
    }
    void salir(){
        System.out.println("SALIENDO....");
    }
    void menu() {
        int opcion;
        do {
            System.out.println("""
                           \n*****MENU DE OPCIONES*****
                           --------------------------
                           1. Rgistrar nota
                           2. Listar nota
                           3. obtener el promedio
                           4. imprimir la notas mayores a 3
                           
                           Digite una opcion:
                           """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.agregar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.promedio();
                    break;
                case 4:
                    this.listarMayores();
                    break;
                case 5 :
                    this.salir();
                    break;

            }
        } while (opcion != 5);
    }
}
