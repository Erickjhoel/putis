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

    public static void ejercicio3(Scanner sc){
        int contadorp=0;
        int contadorn=0;
        int sumasp=0;
        int sumasn=0;
         int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca 5 numeros");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
        if(numeros[i]>0){
            contadorp++;
           sumasp= sumasp +numeros[i];
           }else{
            contadorn++;
           sumasn= sumasn+numeros[i];
           }
        }
         int mediap= sumasp/contadorp;
         int median= sumasn/contadorn;
         if(contadorn==0){
             System.out.println("La media negativa es 0");}
         
        System.out.println("La media de numeros positivos son" + mediap);
        System.out.println("La media de numeros negativos son" + median);
        }
    }


