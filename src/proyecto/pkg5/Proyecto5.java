/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg5;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Proyecto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner kb=new Scanner(System.in);//Método scanner para introducir valores por teclado
        int[][] A;//Se declara la matriz 
        System.out.println("Problema 5");
        //Se ingresa el tamaño de la matriz
             System.out.println("\nIngrese el ancho de la matriz");
                int m=kb.nextInt();
             System.out.println("\nIngrese el alto de la matriz");
                int n=kb.nextInt();
        
        A=matriz(m,n);//Se le otorgan valores a la matriz mediante el metodo matriz()
        sumafilas(A,m,n);//Mediante el método sumafilas()se obtiene el vector con la suma de las filas de la matriz
    }
    public static int[][] matriz(int m, int n){//Método que devuelve una matriz con valores ingresados por el usuario
        int[][] matriz= new int[m][n];//Declaración de la matriz con tamaño determinado por el usuario
        System.out.println("\nIntroduzca los valores de la matriz ");
            for (int i = 0; i < matriz.length; i++) {//Se utiliza un for para recorrer las columnas del arreglo
                for (int j = 0; j < matriz[i].length; j++) {//Se utiliza otro for para recorrer las filas
                    matriz[i][j]=solicitarentero();//Se ingresan los valores de la matriz en cada espacio de la matriz
                }
            }
        return matriz;//Se regresa la matriz con valores introducidos por el usuario
    }
    public static int solicitarentero(){//Método para ingresar por teclado valores enteros
        Scanner kb=new Scanner (System.in);//Llamo al método Scanner de la librería para introducir valores por teclado
        int n=0;
        boolean flag;
         do{
            try{//Se utiliza Try & catch para evitar errores al ingresar datos por teclado
                n=kb.nextInt();
                flag= true;
            }catch (Exception ex) {
                System.out.println("Dato no válido");
                flag=false;
                kb.nextLine();          
            }               
         }while(flag==false);
        return n;//Se devuelve un valor entero
    }
    public static void sumafilas(int[][]A,int m,int n){//Metodo para sumar las filas de una matriz e imprimir un vector
        int[]vector = new int[m];//Se declara el vector con el tamaño con respecto al nuero de columnas de la matriz
        
        System.out.println("\nEl vector de la suma de cada fila es: ");
       System.out.print("{");
        for (int i = 0; i < A.length; i++) {//Se utiliza un for para las columnas de la matriz
            for (int j = 0; j < A[i].length; j++) {//Se utiliza otro for para las filas
                vector[i] += A[i][j];     //Se sumará cada valor que hay en las filas de la matriz y se asignarán a un vector
            }
            System.out.print(vector[i]);//Se imprime cada suma obtenida de las filas de la matri
            if(i<m-1)System.out.print(",");//Se pondrá una coma hasta un valor antes del último del vector
        }
        System.out.println("}");
        System.out.println("");//Salto de línea
    }
}
