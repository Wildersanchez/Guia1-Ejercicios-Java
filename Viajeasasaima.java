import java.util.Scanner;
/**
 * Calcula la cantidad de viajes necesarios y el valor de la gasolina para transportar una carga de bogota a sasaima
 * 
 * @author WilderSanchez 
 * @version 04082019
 */
public class Viajeasasaima
{
   public static void main(String[] args)
   
    {
double d; // Corresponde a la distancia de bogota a sasaima (80 km aprox): Dato de entrada
double n; // Corresponde a la cantidad de kilos a transportar: Dato de entrada
double c; // Corresponde a la capacidad del camion(5000 kg): Dato de entrada
double g; // Corresponde al valor de la gasolina por viaje($80000):Dato de entrada
double m; // Corresponde a la cantidad de galones por viaje(8 gl): Dato de entrada
double v; // Corresponde a la cantidad de viajes a realizar: Dato de salida
double valor; // Corresponde al valor de la gasolina: Dato de salida

   
   Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese la cantidad de kg a transportar: ");
       n = teclado.nextDouble();
       
       
       // 2. Hallar los datos de salida
       v = n / 5000;
       m = 8;
       valor = 80000 * v;
    
       
       
              // 3. Mostrar los datos de salida
       System.out.println("La cantidad de viajes requeridos son " + v);
       System.out.println("En cada viaje se gastaran la siguiente catidad de galones de gasolina " + m);
           System.out.println("El valor de la gasolina es" + valor);
       
    }
}

