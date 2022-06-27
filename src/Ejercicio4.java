package src;

public class Ejercicio4 {
    public static String invertircadena(String cadena, int indice){
        String inverse;
        if (indice == 0) {
            inverse = String.valueOf(cadena.charAt(indice));
        }else{
            inverse = String.valueOf(cadena.charAt(indice))+ invertircadena(cadena, indice-1);
        }
        return inverse;
    }
    public static String invertircadena(String cadena){
        return invertircadena(cadena,cadena.length()-1);
    }
}