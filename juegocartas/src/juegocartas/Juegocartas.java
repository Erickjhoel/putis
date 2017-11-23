/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class Juegocartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        //array 40 cartas
        int cartas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //barajear
        juegocartas(cartas);
        //turno jugador
        float puntosjug = 0;
        int carta;
        for (int i = 0, x = 0; i < cartas.length && x != 2; i++) {

            System.out.println("Tu carta es:"+ cartas[i]);
            if (puntosjug < 7.5) {
                System.out.println("Pedir otro numero o 2 plantarse");
                x = sc.nextInt();
            }
            if(x==2){
                System.out.println("Tus puntos son"+puntosjug);
            }
            

        }
        //8.9.10=0.5
        //turno maquina
    }

    public static void juegocartas(int[] array) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;

        for (int i = 0; i < 20; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
        }

    }

}
