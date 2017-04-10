
package ejercicios;


public class ejercicio3 {
    public static void main(String[] args) {
        
        int MontoCompra = 2000;
        String TipoDePago = "contado";
        
        if (TipoDePago == "contado"){
            int Descuento = MontoCompra / 10;
            System.out.println("El Descuento Es De " + Descuento);
            int MontoConDescuento = MontoCompra - Descuento;
            System.out.println("El Monto Con Descuento Es De " + MontoConDescuento); 
        }
    }   
}
