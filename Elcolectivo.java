import java.util.Scanner;
/**
 * Permite calcular el  valor  a pagar por los turistas y a la empresa transportadora
 * 
 * @author WilderSanchez
 * @version 04082019
 */
public class Elcolectivo
{
    public static void main(String[] args)
   
    {
double n; // Corresponde a la cantidad de turistas que van al hotel: Dato de entrada
double c; // Corresponde a la capacidad del colectivo(25 personas): Dato de entrada
double viajes; // Corresponde a la cantidad de viajes que se deben hacer: Dato de salida
double valor; // Corresponde al valor de los viajes: Dato de salida
double propietario; // Corresponde al valor a pagar al propietario: Dato de salida

   
   Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese la cantidad de turistas a transportar: ");
       n = teclado.nextDouble();
       
       
       // 2. Hallar los datos de salida
       viajes = n / 25;
       valor = n * 10000;
       propietario = n * 2000;
    
       
       
              // 3. Mostrar los datos de salida
       System.out.println("La cantidad de viajes requeridos son " + viajes);
       System.out.println("El valor de los viajes es " + valor);
           System.out.println("El valor a pagar al propietario es" + propietario);
        }
}
