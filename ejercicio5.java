
package ejercicios;

public class ejercicio5 {
    public static void main(String[] args) {
        
        
        int nota1 = 5;
        int nota2 = 2;
        int nota3 = 10;
        int nota4 = 7;
        int nota5 = 2;
        
        float sumadas = nota1 + nota2 + nota3 + nota4 + nota5;
        float promedio = sumadas / 5;
        
        System.out.println("El Promedio Es De " + promedio);
        
        if (promedio >= 7){
            System.out.println("Está Aprobado");
        }else{
            System.out.println("Está Desaprobado");
        }
    }    
}
