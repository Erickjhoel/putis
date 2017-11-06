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
                ejercicio2();
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
        for (int i = 0; i < 5; i++) {
        System.out.println("Introduzca 5 numeros");
        i=sc.nextInt();
        
        }
        int[] lectura = new int[5]; 
        
        
        
        
        }
        
}
