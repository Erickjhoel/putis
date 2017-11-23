/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erickejerciciosarray;

import java.util.Scanner;
import java.util.Random;

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
        System.out.print("\n Opcion 1:Leer 5 numeros de la manera introducida"
                + "\n Opcion 2:Leer 5 numeros de manera inversa"
                + "\n Opcion 3:Media positivos,negativos y contador de 0"
                + "\n Opcion 4:Leer 10 numeros de la siguiente orden:el primero,el último,el segundo,el penúltimo,etc"
                + "\n Opcion 5:Leer 10 numeros:el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc"
                + "\n Opcion 6:Mesclar dos tablas:3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc. "
                + "\n Opcion 7:Indicar si los numeros estan ordenados de manera creciente, decreciente o desordenados"
                + "\n Opcion 8:Insertar un numero en la tabla desplazando los que estan detras"
                + "\n Opcion 9:Desplazar una posicion hacia abajo colocando el ultimo como primero"
                + "\n Opcion 10:Desplazar las posiciones que sean introducidas"
                + "\n Opcion 11:Insertar un numero de manera que la tabla continue estando ordenada de manera creciente"
                + "\n Opcion 12:Eliminar elemento sin dejar huecos"
                + "\n Opcion 13:Trabajar con valores y con indices"
                + "\n Opcion 14:Fusionar dos tablas de manera que continuen ordenadas"
                + "\n Opcion 15:Buscar un numero en una tabla"
                + "\n Opcion 16:Aplicacion de centro educativo"
                + "\n Opcion 17:Baraja de cartas\n");
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
            mezcla[i + i] = numeros1[i + 2 + i + i];
        }
        for (int i = 0; i < 4; i++) {
            mezcla[i + 1 + i] = numeros2[i + 2 + i + i];
        }
        //sacar por pantalla*/
        for (int i = 0; i < mezcla.length; i++) {
            System.out.println("Los numeros son:" + mezcla[i]);
        }
    }

    public static void ejercicio7(Scanner sc) {
        int numeros[] = new int[10];
        boolean creciente;
        boolean decreciente;
        creciente = false;
        decreciente = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca 10 numeros en cualquier orden");
            numeros[i] = sc.nextInt();
        }
        //tener en cuenta que el numero no sobrepase el array*/
        for (int i = 0; i < 9; i++) {
            if (numeros[i] > numeros[i + 1]) {
                decreciente = true;
            }

            if (numeros[i] < numeros[i + 1]) {
                creciente = true;
            }

        }

        if (decreciente==true && creciente ==false) {
            System.out.println("Los numeros estan ordenados de manera decreciente.");
        }
        else if (creciente==true && decreciente ==false) {
            System.out.println("Los numeros estan ordenados de manera creciente");
        }
        else if (creciente==true && decreciente==true) {
            System.out.println("Los numeros están desordenados");
        }
    }

    public static void ejercicio8(Scanner sc) {
        int numeros[] = new int[10];
        int posicion;
        int num;
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduzca 8 numeros");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Introduzca una posicion");
        posicion = sc.nextInt();
        System.out.println("Introduzca un numero");
        num = sc.nextInt();
        for (int i = 0; numeros[i] == 0; i++) {
            posicion = posicion++;
        }
        for (int i = 7; i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[posicion] = num;
        System.out.println("El nuevo orden de la tabla es:");
        for (int i = 0; i < 9; i++) {
            System.out.println(numeros[i]);
        }

    }

    public static void ejercicio9(Scanner sc) {
        int tabla[] = new int[10];
        int numf;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un numero");
            tabla[i] = sc.nextInt();
        }

        //MANERA DE GUARDAR NUMERO!!!*/
        numf = tabla[9];
        for (int i = 0; i < 9; i++) {
            tabla[9 - i] = tabla[8 - i];
        }
        tabla[0] = numf;
        System.out.println("El nuevo orden de la tabla es:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
    }

    public static void ejercicio10(Scanner sc) {
        int tabla[] = new int[10];
        int n;
        int d;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca Diez numeros");
            tabla[i] = sc.nextInt();
        }

        System.out.println("Introduzca numeros a desplazar");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            d = tabla[9];
            for (int a = 0; a < 9; a++) {
                tabla[9 - a] = tabla[8 - a];
            }
            tabla[0] = d;

        }
        System.out.println("El nuevo orden de la tabla es:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
    }

    public static void ejercicio11(Scanner sc) {
        int numeros[] = new int[10];
        System.out.println("Introduzca 5 numeros de manera creciente");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }
        int n;
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        for (int a = 0; a < 5; a++) {
            if (numeros[4] < n) {
                numeros[5] = n;
                break;
            }
            if (numeros[0] > n) {
                int x = 5 - a;
                for (int b = 0; b < x; b++) {

                    numeros[5 - b] = numeros[4 - b];
                }
                numeros[0] = n;
                break;
            }
            if (numeros[a] < n && numeros[a + 1] > n) {
                int x = 5 - a;
                for (int b = 0; b < x; b++) {

                    numeros[5 - b] = numeros[4 - b];
                }
                numeros[a + 1] = n;
                break;
            }
            if (numeros[a] == n) {
                int x = 5 - a;
                for (int b = 0; b < x; b++) {
                    numeros[5 - b] = numeros[4 - b];
                }
                numeros[a + 1] = n;
                break;
            }

        }
        System.out.println("la nueva orden de la tabla es:");
        for (int c = 0; c < numeros.length; c++) {
            System.out.println(numeros[c]);
        }

    }

    public static void ejercicio12(Scanner sc) {
        int numeros[] = new int[10];
        int posicion;
        //pedir 10 numeros
        System.out.println("Introduzca 10 numeros");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }
        //eleguir posicion a eliminar
        System.out.println("Introduzca la posicion a eliminar de 0 a 9");
        posicion = sc.nextInt();
        //elimiar posicion y mover array
        for (int i = posicion; i < 9; i++) {
            numeros[i] = numeros[i + 1];

            //sacar por pantalla final
        }
        System.out.println("la nueva orden de la tabla es:");
        for (int c = 0; c < 9; c++) {
            System.out.println(numeros[c]);
        }

    }

    public static void ejercicio13(Scanner sc) {
        int numeros[] = new int[10];
        System.out.println("Introduces diez numeros a");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {

                System.out.println("El numero par " + numeros[i]);

                System.out.println("Se encuentra en la posicion " + i);
            }
        }
        System.out.println("NUMEROS IMPARES:");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 != 0) {
                System.out.println("El numero impar " + numeros[i]);
                System.out.println("Se encuentra en la posicion " + i);
            }
        }

    }

    public static void ejercicio14(Scanner sc) {
        int numeros[] = new int[10];
        int numeros2[] = new int[10];
        System.out.println("Introduzca los 10 numeros de la primera tabla");
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = sc.nextInt();
        }
        System.out.println("Introduzca los 10 numeros de la segunda tabla");

        for (int i = 0; i < numeros2.length; i++) {

            numeros2[i] = sc.nextInt();
        }
        int numeros3[] = new int[20];
        int pri = 0, seg = 0, ter = 0;
        for (int i = 0; pri < 10 && seg < 10; i++) {
            if (numeros[pri] < numeros2[seg]) {
                numeros3[ter] = numeros[pri];
                pri++;
            } else {
                numeros3[ter] = numeros2[seg];
                seg++;
            }
            ter++;
        }
        if (pri == 10) {
            for (int i = 0; seg < 10; i++) {
                numeros3[ter] = numeros2[seg];
                seg++;
                ter++;
            }
        } else {
            for (int i = 0; seg < 10; i++) {
                numeros3[ter] = numeros2[pri];
                seg++;
                ter++;
            }
        }
         System.out.println("La nueva tabla es: ");
        for (int x = 0; x < numeros3.length;x++) {
            System.out.println( numeros3[x]);
        }
    }

    public static void ejercicio15(Scanner sc) {
        int tabla[] = new int[10];
        int num;
        int posicion;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca 10 numeros de manera creciente");
            tabla[i] = sc.nextInt();
        }
        System.out.println("Introduzca el numero que busca ");
        num = sc.nextInt();
        posicion = 0;
        while (posicion < 10 && tabla[posicion] < num) {
            posicion++;
        }
        if (posicion >= 10) {
            System.out.println("El numero fuera de la tabla");
        } else {
            if (tabla[posicion] == num) {
                System.out.println("El numero se ncuentra en la posicion:" + posicion);
            } else {
                System.out.println("El numero no se encuentra dentro de la tabla");
            }
        }
    }

    public static void ejercicio16(Scanner sc) {
        int tri1[] = new int[5];
        int tri2[] = new int[5];
        int tri3[] = new int[5];
        int primero = 0;
        int segundo = 0;
        int tercero = 0;
        int media;
        System.out.println("Notas de primer trimestre:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            tri1[i] = sc.nextInt();
        }
        System.out.println("Notas del segundo trimestre:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno" + i);
            tri2[i] = sc.nextInt();
        }
        System.out.println("Notas del tercer trimestre:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumnos " + i);
            tri3[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            primero = primero + tri1[i];

            segundo = segundo + tri2[i];

            tercero = tercero + tri3[i];
        }
        System.out.println("\n Media del primer trimestre: " + primero / 5
                + "\n Media del segundo trimestre: " + segundo / 5
                + "\n Media del tercer timestre:" + tercero / 5);
        System.out.print("Introduzca la posicion del alumno que quiere saber la media");
        int num = sc.nextInt();
        if (num > 4) {
            System.out.println("La posicion del alumno no existe");

        } else {
            media = (tri1[num] + tri2[num] + tri3[num]) / 3;
            System.out.println("La media del alumno es:" + media);

        }
    }

    public static void ejercicio17(Scanner sc) {
        Scanner scanner = new Scanner(System.in);
        //inicializa dos array de 10 cartas
        int[] mazo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mazo2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //inicializa una array de 10 cartas
        //barajea los mazos
        barajarArray(mazo);
        barajarArray(mazo2);
        //ir sacando una a una las cartas y comparandolas a ver quien gana
        int ca1 = 0;
        int ca2 = 0;
        for (int i = 0; i < mazo.length; i++) {
            if (mazo2[i] > mazo[i]) {
                ca2++;
            }
        }
        for (int i = 0; i < mazo2.length; i++) {
            if (mazo2[i] < mazo[i]) {
                ca1++;
            }
        }
        //ir sacando una a una las cartas y comparandolas a ver quien gana
        //sacar el ganador.
        int cartamen;
        System.out.println("Eligue una posicion del 1 al 10");

        cartamen = sc.nextInt();

        if (ca2 > ca1) {
            System.out.println("Has ganado!! " + cartamen);
            System.out.println("La batalla ha sido " + mazo[ca1] + "vs" + mazo2[ca2]);
        } else {
            System.out.println("Has perdido:´( " + cartamen + " gana la maquina");
            System.out.println("La batalla ha sido " + mazo[ca1] + "vs" + mazo2[ca2]);
        }

    }

    public static void barajarArray(int[] array) {
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
