/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
         System.out.println("introduzca numeros a introducir:");
        int num = sc.nextInt();
        int numerosp=0;
        int numerosi=0;
    
    int [] numeros = new int [num];
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("introduzca numero");
            numeros[i] = sc.nextInt();
        if (i%2==0){
        numerosp = numerosp+1;}

        else{numerosi = numerosi+1;} 

    int [] pares = new int [numerosp];
        for (int i = ; i <numeros.length; i++){
        if (i%2==0){
        numerosp=numerosp+1} 
    int [] impares = new int [numerosi];

    }
           
            
            
            

        }
    
    
    }

}
