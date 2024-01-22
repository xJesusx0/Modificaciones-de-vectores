package tareavectores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Metodos {
    public static void imprimirVector(double[] vector){
        String resultado = "";
        for(int i = 0 ; i < vector.length ; i++){
            resultado += (vector[i] + "\t");
        }
        System.out.println( resultado);
    }
    
    public static double[] agregar(int indice,double dato,double[] vector){
        vector[indice] = dato;
        return vector;
    }
    public static double[] insertar(int indice,double dato,double[] vector){
        double nuevoVector[] = new double[vector.length];
        int contador = 0;
        for(int i = 0 ; i < vector.length ; i++){
            if(contador == indice){
                nuevoVector[contador] = dato;
            } else {
                nuevoVector[i] = vector[i];
            }          
            contador++;
        }
        return nuevoVector;
    }
    
    public static double[] eliminar(int indice,double[] vector){
        double nuevoVector[] = new double[vector.length];
        int contador = 0;
        for(int i = 0 ; i < vector.length ; i++){
            if(i != indice){
                nuevoVector[contador] = vector[i];
                contador++;
            }
        }
        return nuevoVector;
    }
    
    public static void mostrarError(String mensaje){
        System.out.println("Error: " + mensaje);
    }
    
    
    public static String input(String mensaje){ 
        Scanner input = new Scanner(System.in);
        while (true) {            
            System.out.println(mensaje);
            String UserInput = input.nextLine();

            if (!UserInput.trim().isEmpty()) {
                return UserInput;
                
            } else {
                mostrarError("La entrada esta vacia, intentelo denuevo");
            }
        }
    }
    public static int inputInt(String mensaje){
        while(true){
        String entrada = input(mensaje);
        
            try {
                return Integer.parseInt(entrada);
                
            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intenelo denuevo");

            }
        }
    }
    public static double inputDouble(String mensaje){
        while(true){
        String entrada = input(mensaje);
        
            try {
                return Double.parseDouble(entrada);
                
            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intentelo denuevo");

            }
        }
    }
    public static byte inputByte(String mensaje){
        while(true){
        String entrada = input(mensaje);
        
            try {
                return Byte.valueOf(entrada);
                
            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intentelo denuevo");

            }
        }
    }
    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("0 - Salir");
        System.out.println("1 - Mostrar vector");
        System.out.println("2 - Eliminar un elemento");
        System.out.println("3 - Agregar un elemento");
        System.out.println("-------------------------");

    }
}
