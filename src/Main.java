import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Nahuel Gallardo";
        String tipoDeCuenta = "Corriente";
        double saldo = 1000000;
        int opcion = 0;

        System.out.println("******************************************");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + "$" + saldo);
        System.out.println("******************************************");

        String menu = """
                *** Escriba el numero de la opcion deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("El saldo actualizado es: " + "$" + saldo);
                break;
            case 2:
                System.out.println("Cual es el valor que desea retirar");
                double valorARetirar = teclado.nextDouble();
                if (valorARetirar > saldo ) {
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo = saldo - valorARetirar;
                    System.out.println("El saldo actualizado es: " + saldo);
                }
                break;
            case 3:
                System.out.println("Cual es el valor que desea depositar");
                double valorADepositar = teclado.nextDouble();
                saldo += valorADepositar;
                System.out.println("El saldo actualizado es: " + saldo);
                break;
            case 9:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    }
}