import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int numeroDeOpcion = 0;
        while ( numeroDeOpcion != 8) {
            System.out.println("*******************************************\n" +
                    "Sea bienvenido/a al Conversor de Moneda\n" +
                    "1) Peso mexicano ==> Dólar\n" +
                    "2) Dólar ==> Peso mexicano\n" +
                    "3) Peso mexicano ==> Dólar Canádiense\n" +
                    "4) Dólar Canádiense ==> Peso mexicano\n" +
                    "5) Peso mexicano ==> Peso Colombiano\n" +
                    "6) Peso Colombiano ==> Peso mexicano\n" +
                    "7) Consultar otra conversión\n" +
                    "8) Salir\n" +
                    "*******************************************\n" +
                    "Elija una opción válida: "
            );

            while (!lectura.hasNextInt()) {
                System.out.println("Por favor ingrese un valor válido");
                lectura.next();
            }
            numeroDeOpcion = Integer.valueOf(lectura.nextInt());
            lectura.nextLine();

            switch (numeroDeOpcion) {
                case 1:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("MXN", "CAD", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("CAD", "MXN", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("MXN", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "MXN", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
