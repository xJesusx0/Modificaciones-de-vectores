package tareavectoresjesus;

import static tareavectores.Metodos.*;

public class TareaVectoresJesus {
    public static void main(String[] args) {
        
        int tamaño = inputInt("Ingrese el tamaño del vector");
        
        double vector[] = new double[tamaño];
        
        while(true){
            menu();
            
            byte opcion = inputByte("Ingrese la opcion");
            
            if(opcion == 0){
                break;
            }
            
            if(opcion == 1){
                imprimirVector(vector);
            }
            
            if(opcion == 2){
                imprimirVector(vector);
                int indice = inputInt("Ingrese el indice del elemento que desea eliminar");
                vector = eliminar(indice,vector);
                System.out.println("Elemento eliminado");
            }
            
            if (opcion == 3){
                imprimirVector(vector);
                int indice = inputInt("Ingrese la posicion en la que desea agregar o reemplazar un elemento");
                double elemento = inputDouble("Ingrese el elemento que desea agregar");
                vector = agregar(indice,elemento,vector);
                System.out.println("Elemento agregado");
            }
            
            if(opcion > 3 || opcion < 0){
                mostrarError("Opcion invalida");
            }
        }
    }    
}
