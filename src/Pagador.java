import utilidades.Pago;

public class Pagador {
    public static void main(String[] args) {
        // Elige si trabajas con Pago o con Mensajero
        // Aquí un ejemplo con Pago:

        Pago pago = new Pago(2000);

        // ================================
        // EJERCICIO 1: Pagar en efectivo
        // ================================
        // 1. Llama al método pagar(double) pasando una cantidad.
        // 2. Observa qué se imprime.
        // Tu código aquí ↓

        pago.pagar(500);


        // ================================
        // EJERCICIO 2: Pagar con tarjeta
        // ================================
        // 1. Llama al método pagar(double, String) pasando cantidad y un pin.
        // 2. Imprime el resultado.
        // Tu código aquí ↓

        pago.pagar(750, "1234");
       

        // ================================
        // EJERCICIO 3: Pagar con Bizum
        // ================================
        // 1. Llama al método pagar(double, int) pasando cantidad y un número de teléfono.
        // 2. Imprime el resultado.
        // Tu código aquí ↓

        pago.pagar(300, 612345678);


    }
}
