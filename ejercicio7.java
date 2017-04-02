
package ejercicios;

public class ejercicio7 {
    public static void main(String[] args) {
        
       double valor1 = 12;
       double valor2 = 2;
       
       String operacion = "suma";
       
       
       if (operacion == "suma"){
           double resultado = valor1 + valor2;
           System.out.println("El Resultado De La Suma Es " + resultado);
       }
       
       
       if (operacion == "resta"){
           double resultado = valor1 - valor2;
           System.out.println("El Resultado De La Resta Es " + resultado);
       }
       
       
       if (operacion == "multiplicacion"){
           double resultado = valor1 * valor2;
           System.out.println("El Resultado De La Multiplicacion Es " + resultado);
        }
       
       
       if (operacion == "division"){
           double resultado = valor1 / valor2;
           System.out.println("El Resultado De La Division Es " + resultado);
       }   
    }   
}
