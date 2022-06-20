package src;

/**
 * Ejercicio3
 */
public class Ejercicio3 {
    
    public static int sumaVector(int vector[],int n){
        int suma=0;
        if (n==0){
            return vector[0];
        }else{
            return vector[n]+sumaVector(vector,n-1);
        }
    }
    
}