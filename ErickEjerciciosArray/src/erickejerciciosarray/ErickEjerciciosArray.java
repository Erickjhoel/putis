/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erickejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class ErickEjerciciosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Opcion 1" + "\n Opcion 2" + "\n Opcion 3" + "\n Opcion 4" + "\n Opcion 5"
                + "\n Opcion 6" + "\n Opcion 7" + "\n Opcion 8" + "\n Opcion 9" + "\n Opcion 10"
                + "\n Opcion 11" + "\n Opcion 12" + "\n Opcion 13" + "\n Opcion 14" + "\n Opcion 15"
                + "\n Opcion 16" + "\n Opcion 17\n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            case 6:
                ejercicio6(sc);
                break;
            case 7:
                ejercicio7(sc);
                break;
            case 8:
                ejercicio8(sc);
                break;
            case 9:
                ejercicio9(sc);
                break;
            case 10:
                ejercicio10(sc);
                break;
            case 11:
                ejercicio11(sc);
                break;
            case 12:
                ejercicio12(sc);
                break;
            case 13:
                ejercicio13(sc);
                break;
            case 14:
                ejercicio14(sc);
                break;
            case 15:
                ejercicio15(sc);
                break;
            case 16:
                ejercicio16(sc);
                break;
            case 17:
                ejercicio17(sc);
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public static void ejercicio1(Scanner sc) {

        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca 5 numeros");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Sus numeros son" + numeros[i]);
        }

    }

    public static void ejercicio2(Scanner sc) {
        //inicializar array
        int numerosa[] = new int[5];
        for (int i = 0; i < numerosa.length; i++) {
            System.out.println("Introduzca 5 numeros");
            numerosa[i] = sc.nextInt();
        }
        //recorrer array
        for (int i = numerosa.length - 1; i >= 0; i--) {
            System.out.println("Sus numeros son" + numerosa[i]);
        }
    }

    public static void ejercicio3(Scanner sc) {
        int contadorp = 0;
        int contadorn = 0;
        int sumasp = 0;
        int sumasn = 0;
        int contador0 = 0;
        int sumas0 = 0;
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca 5 numeros");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                contadorp++;
                sumasp = sumasp + numeros[i];
            } else if (numeros[i] < 0) {
                contadorn++;
                sumasn = sumasn + numeros[i];
            } else {
                contador0++;
                sumas0 = sumas0 + numeros[i];
            }
        }
        int median = sumasn / contadorn;
        int mediap = sumasp / contadorp;
        int media0 = 0;
        if (contador0 == 5) {
            System.out.println("El numero de 0 es:" + contador0);
        }
        if (contadorn == 0) {
            System.out.println("Es imposible dividir entre 0");
        }
        if (contadorp == 0) {
            System.out.println("Es imposible dividir entre 0");
        } else {
            System.out.println("La media de positivos es:" + mediap);
            System.out.println("La media de negativos es:" + median);
            System.out.println("La media de 0 es:" + media0);
        }
    }

    public static void ejercicio4(Scanner sc) {
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca los numeros");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Los numeros son:" + numeros[i]);
            System.out.println("Los numeros son:" + numeros[numeros.length - 1 - i]);
        }

    }

    public static void ejercicio5(Scanner sc) {
        //primer array*/
        int numeros1[] = new int[10];
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduzca 10 numeros");
            numeros1[i] = sc.nextInt();
        }
        //segundo array*/
        int numeros2[] = new int[10];
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduzca otros 10 numeros");
            numeros2[i] = sc.nextInt();
        }
        //mezcla de arrays*/
        int mezcla[] = new int[20];
        for (int i = 0; i < 10; i++) {
            mezcla[i + i] = numeros1[i];
        }
        for (int i = 0; i < 10; i++) {
            mezcla[i + 1 + i] = numeros2[i];
        }
        //sacar por pantalla*/
        for (int i = 0; i < mezcla.length; i++) {
            System.out.println("Los numeros son:" + mezcla[i]);
        }

    }
    public static void ejercicio6(Scanner sc) {
        int numeros1[] = new int[12];
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduzca 10 numeros");
            numeros1[i] = sc.nextInt();
        }
        //segundo array*/
        int numeros2[] = new int[12];
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduzca otros 10 numeros");
            numeros2[i] = sc.nextInt();
        }
        //mezcla de arrays*/
        int mezcla[] = new int[8];
        for (int i = 0; i < 4; i++) {
            mezcla[i + i] = numeros1[i+2+i+i];
        }
        for (int i = 0; i < 4; i++) {
            mezcla[i + 1 + i] = numeros2[i+2+i+i];
        }
        //sacar por pantalla*/
        for (int i = 0; i < mezcla.length; i++) {
            System.out.println("Los numeros son:" + mezcla[i]);
        }
    }
     public static void ejercicio7(Scanner sc) {
         int numeros[] = new int[10];
          for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca 10 numeros en cualquier orden");
            numeros[i] = sc.nextInt();
          }
          if (numeros[i]= numeros[i++]){
          
          }
     }
}
