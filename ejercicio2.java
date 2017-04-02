
package ejercicios;


public class ejercicio2 {
    public static void main(String[] args) {
        
        int CantidadBancos = 30;
        int CantidadAlumnos = 40;
        
        if (CantidadBancos > CantidadAlumnos){
            int BancosSobrantes = CantidadBancos - CantidadAlumnos;  
            System.out.println("Sobran " + BancosSobrantes + " Bancos");
        }
        if (CantidadAlumnos > CantidadBancos){
            int BancosFaltantes = CantidadAlumnos - CantidadBancos;
            System.out.println("Faltan " + BancosFaltantes + " Bancos");
        }
    } 
}