import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta= "ahorros";
        double saldo = 1599.52;
        int opcion=0;

        System.out.println("**************************");
        System.out.println("\nNombre del cliente "+ nombre);
        System.out.println("El tipo de cuenta es: " +tipoDeCuenta);
        System.out.println("Saldo disponible: " +saldo+"$");
        System.out.println("\n***************************");

        String menu = """
                *** Escriba el núnero de la opción deseada****
                
                1- Consular saldo
                2- Retirar
                3- Depositar
                4-Salir 
                
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion!=4){
            System.out.println(menu);
            opcion=teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Su saldo es "+saldo);
                    break;
                case 2:
                    System.out.println("digite el monto a retirar");
                      double valorARetirar= teclado.nextDouble();
                      if(valorARetirar>saldo){
                          System.out.println("saldo insuficiente");
                          return;

                      }else{
                          saldo-=valorARetirar;
                          System.out.println("Usted ha retirado "+valorARetirar+"$");

                          System.out.println("Su saldo restante es "+saldo);
                      }
                    break;
                case 3:
                    System.out.println("Digite el monto que desea depositar");
                    double valorAdepositar= teclado.nextDouble();
                    System.out.println("Usted ha depositado "+valorAdepositar+"$");
                    saldo+=valorAdepositar;
                    System.out.println("Su saldo actual es de "+saldo+"$");
                default:
                    System.out.println("opción no válida");
            }
        }
    }
}