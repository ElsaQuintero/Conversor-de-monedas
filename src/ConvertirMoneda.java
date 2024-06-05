import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaOrigen,
                                 String monedaDestino,
                                 ConsultaMoneda consulta,
                                 Scanner lectura) {
        Moneda moneda = consulta.buscarMoneda(monedaOrigen,monedaDestino);
        System.out.println("Tasa de cambio obtenida: " + moneda.conversion_rate());
        System.out.println("Ingrese la cantidad de " + monedaOrigen + " que desea convertir");
        double cantidad = lectura.nextDouble();
        double cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println("La cantidad de " + cantidad + " " + monedaOrigen +
                " es equivalente a " + cantidadConvertida + " " + monedaDestino);
    }

    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el código de la moneda de origen: ");
        String monedaOrigen = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el código de la moneda a consultar");
        String monedaDestino = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la cantidad de " + monedaOrigen + " que desea convertir");
        double cantidad = lectura.nextDouble();
        Moneda tasaDeCambio = consulta.buscarMoneda(monedaOrigen,monedaDestino);
        System.out.println("Tasa de cambio obtenida: " + tasaDeCambio.conversion_rate());
        double cantidadConvertida = cantidad * tasaDeCambio.conversion_rate();
        System.out.println("La cantidad de " + cantidad + " " + monedaOrigen +
                " es equivalente a " + cantidadConvertida + " " + monedaDestino);
    }
}