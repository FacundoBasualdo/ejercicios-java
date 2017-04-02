
package ejercicios;

public class ejercicio4 {
    public static void main(String[] args) {
        
        boolean encender = true;        
        String UsuarioIngresado = "Admin";
        String ContraseñaIngresado = "1234";
        
        while(encender == true){ 
        
            if(UsuarioIngresado == "Admin"){
                if (ContraseñaIngresado == "1234"){
                    System.out.println("Bienvenido Admin");
                    encender = false;
                }else{
                    System.out.println("Contraseña Incorrecta");
                    encender = false;
                }
            }
        
            
            if (UsuarioIngresado == "Operador"){
                if (ContraseñaIngresado == "1234"){
                    System.out.println("Bienvenido Operador");
                    encender = false;
                }else{
                    System.out.println("Contraseña Incorrecta");
                    encender = false;
                }
            }
            
            
            if (UsuarioIngresado != "Admin"){
                if (UsuarioIngresado != "Operador"){
                System.out.println("Usuario Desconocido");
                encender = false;
            }
                }
            
            
            if (UsuarioIngresado != "Operador"){
                if (UsuarioIngresado != "Admin"){
                System.out.println("Usuario Desconocido");
                encender = false;
                }
            }
        }
    }
}

