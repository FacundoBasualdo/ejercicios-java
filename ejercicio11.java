
package ejercicios;


public class ejercicio11 {
    public static void main(String[] args) {
        

        int []ListaNumeros = new int[101];
        
        for (int c = 0; c <= 100; c ++){
            ListaNumeros[c] = c;   
        }
        
        for (int c = 0; c <= 100; c ++){
            System.out.println(ListaNumeros[c]);    
        }
    }     
}
