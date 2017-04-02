
package ejercicios;

public class ejercicio6 {
    public static void main(String[] args) {
        
        double dolar = 15.60;
        double euro = 17.90;
        String tipo = "euro";
        
        if (tipo == "dolar"){
            double CantidadDeDolar = 200;
            double Pesos = CantidadDeDolar * dolar;
            System.out.println("La Cantidad De Pesos Son $" + Pesos);
        }
        
        if (tipo == "euro"){
            double CantidadDeEuro = 263;
            double Pesos = CantidadDeEuro * euro;
            System.out.println("La Cantidad De Pesos Son $" + Pesos);
        }
        
        if (tipo != "dolar" && tipo != "euro"){
            System.out.println("Tipo De Moneda Incorrecta");
        }
    }
}
    
