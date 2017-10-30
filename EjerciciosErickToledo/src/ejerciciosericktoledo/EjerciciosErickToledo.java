/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosericktoledo;
import java.util.Scanner;
/**
 *
 * @author flotante
 */
public class EjerciciosErickToledo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Introducir los numeros x teclado
        Scanner sc = new Scanner (System.in);
         System.out.print("\n Opcion 1"+"\n Opcion 2"+"\n Opcion 3"+"\n Opcion 4"+"\n Opcion 5"
                 +"\n Opcion 6"+"\n Opcion 7"+"\n Opcion 8"+"\n Opcion 9"+ "\n Opcion 10"
                 +"\n Opcion 11"+"\n Opcion 12"+"\n Opcion 13\n");
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
            default:
                System.out.println("opcion no valida");

        }
    } 
    public static void ejercicio1(Scanner sc){
        int minimo;
        int maximo;
        
       
        System.out.println("Introduzca el numero minimo");
        minimo = sc.nextInt();
        System.out.println("Introduzca el numero maximo");
        maximo = sc.nextInt();
        
        for (int i=minimo; i<=maximo; i++){
        System.out.println(""+i);
        
            } 
    }
    public static void ejercicio2(){
        int resultado;
        for (int i=0; i<=20; i++){
            resultado=i*5;
            System.out.println(resultado);
    }}
    public static void ejercicio3(Scanner sc){
        int num;
        int contador=0;
        for (int i=0; i<15;i++){
            System.out.println("Introducir numeros");
            num = sc.nextInt();
            contador=contador+num;
        }
        int media= contador/15;
        System.out.println("La media es"+media);
        
        
    }
    
    public static void ejercicio4(Scanner sc){
        int num;
        int numeros;
        int contador=0;
        System.out.println("Introduce numeros ha introducir");
        numeros = sc.nextInt();
        for (int i=0; i<numeros;i++){
            System.out.println("Introducir numeros"+numeros);
            num = sc.nextInt();
            contador=contador+num;
        }
        int media= contador/numeros;
        System.out.println("La media es"+media);
        
        
    }
    public static void ejercicio5(Scanner sc){
        int horas;
        System.out.println("introduzca el numero de horas");
        horas = sc.nextInt();
         int minutos;
        System.out.println("introduzca el numero de minutos");
        minutos = sc.nextInt();
         int segundos;
        System.out.println("introduzca el numero de segundos");
        segundos = sc.nextInt();
        
        int respuesta;
        respuesta=horas*3600+minutos*60+segundos;
        System.out.println("El tiempo en segundos es "+respuesta);}
    public static void ejercicio6(Scanner sc){
    int segundos;
    System.out.println("introduzca los segundos");
    segundos=sc.nextInt ();
    int respuestahoras;
    respuestahoras =segundos/3600;
    int resto;
        resto = segundos%3600;
    int respuestaminutos;
    respuestaminutos =resto/60;
    int restominutos;
        restominutos = resto%60;
    int respuestasegundos;
    respuestasegundos = restominutos;
    System.out.println("horas"+respuestahoras+"minutos"+respuestaminutos+"segundos"+respuestasegundos);
     }
    public static void ejercicio7(Scanner sc){
    int num, max = 0, min = 0;
    for (int i = 1; i < 11; i++) {
            System.out.println(" Introduzca un nummero: ");
            num = sc.nextInt();
            if (min != 0 && max != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;}
        }
        System.out.println("El numero mayor es: " + max);
        System.out.println("El numero menor es: " + min);
    }
    public static void ejercicio8(Scanner sc){
        int factorial=1;
        int num;
        System.out.println("Introduzca un numero: ");
        num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    public static void ejercicio9(Scanner sc){
    int n1;
   System.out.println("introduzca el primer numero");
   n1= sc.nextInt();
    int n2;
    System.out.println("Introduzca el segundo numero");
    n2= sc.nextInt();
    int n3;
    System.out.println("Introduzca el tercer numero");
    n3= sc.nextInt();
    int mayor;
    int menor;
    int medio;
    
    if (n1<n2 && n1<n3 && n2<n3 && n2>n1 && n3>n1 && n3>n2){
        System.out.println("menor a mayor:"+n1+"-"+n2+"-"+n3);}
    if (n1<n2 && n1<n3 && n3<n2 && n3>n1 && n2>n1 && n2>n3){
        System.out.println("menor a mayor:"+n1+"-"+n3+"-"+n2);}
    if (n2<n1 && n2<n3 && n1<n3 && n1>n2 && n3>n1 && n3>n2){
        System.out.println("menor a mayor:"+n2+"-"+n1+"-"+n3);}
    if (n2<n1 && n2<n3 && n3<n1 && n3>n2 && n1>n3 && n1>n2){
        System.out.println("menor a mayor:"+n2+"-"+n3+"-"+n1);}
    if (n3<n2 && n3<n1 && n2<n1 && n2>n1 && n1>n2 && n1>n3){
        System.out.println("menor a mayor:"+n3+"-"+n2+"-"+n1);}
    if (n3<n2 && n3<n1 && n1<n2 && n1>n3 && n2>n1 && n2>n1){
        System.out.println("menor a mayor:"+n3+"-"+n1+"-"+n2);}
    }
    
    public static void ejercicio10(Scanner sc){
     System.out.println("Introduzca una nota");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Dies");
             break;    
            default:
                System.out.println("Nota invalida");
        }
    }
    public static void ejercicio11(Scanner sc){
        float nota;
        System.out.println("Introduzca una nota ");
        nota = sc.nextFloat();
    if (nota < 5) {
      System.out.print("Nota: Insuficiente ");
    }
    
    if ((nota >= 5) && (nota < 6)) {
      System.out.print("Nota: Suficiente ");
    }
    
    if ((nota >= 6) && (nota < 7)) {
      System.out.print("Nota: Bien ");
    }
    
    if ((nota >= 7) && (nota < 9)) {
      System.out.print("Nota: Notable ");
    }
    
    if (nota >= 9) {
      System.out.print("Nota: Sobresaliente ");
    }
    }
    public static void ejercicio12(Scanner sc){
    int contador = 0; int notas; int numA;int Apro=0;int Sus=0;
       System.out.println("Introduzca numero de alumnos");
        numA=sc.nextInt();
    for (int i=0;i<numA;i++) { 
        System.out.println("Introzca "+numA+ "notas de los alumnos");
        notas = sc.nextInt();
        if(notas>10 || notas<0){
            System.out.println("Nota invalida");   
    break;
        }if(notas<5){
            Sus=Sus+1;
        }if((10>=notas)&&(notas>=5)){
            Apro=Apro+1;
        }
        contador = contador+notas;
        
       }
    int media = contador/numA;
        System.out.println("La media es "+media);
        System.out.println("El numero de aprobados son "+Apro);
        System.out.println("El numero de suspensos son "+Sus);
    }
    public static void ejercicio13(Scanner sc){
        int num;
        boolean primo;
        int x;
        System.out.println("Introduzca el numero");
        num= sc.nextInt();
        for (int i=1; i<=num; i++){
            primo = true;
        for (x=2; x<i; x++){
            if (i%x==0){
                primo=false;}}
        if (primo){
            System.out.println(i+"primo");
        }
        }
    
    }
}