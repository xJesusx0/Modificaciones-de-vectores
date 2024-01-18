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
        }
    }    
}
