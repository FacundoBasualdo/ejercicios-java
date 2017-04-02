
package ejercicios;
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        
        
        System.out.println("Crear Usuario ");
        String CrearUsuario = "toto";
        System.out.println("Crear Contraseña ");
        String CrearContraseña = "123";
        
        
        System.out.println("Ingrese Su Usuario ");
        String IniciarUsuario = "toto";
        
        if (CrearUsuario == IniciarUsuario) {
            System.out.println("Usuario Correcto");    
            System.out.println("Ingrese Su Contraseña ");
            String IniciarContraseña = "123";
        if (CrearContraseña == IniciarContraseña) {
            System.out.println("Contraseña Correcta");
            System.out.println("Ingresó Al Sistema");
        }else{
            System.out.println("Contraseña Incorrecta");
        }
       
        
        }else{
            System.out.println("Usuario Incorrecto");
        }
    }
}


