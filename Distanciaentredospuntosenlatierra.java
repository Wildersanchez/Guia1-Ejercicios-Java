import java.util.Scanner;
/**
 * Encontrar la distancia entre dos puntos en la tierra teniendo sus puntos de longitud y latitud
 * 
 * @author WilderSanchez 
 * @version 04082019
 */
public class Distanciaentredospuntosenlatierra
{
   public static void main(String[] args)
   {
   double Latitud1; // Corresponde a la latitud de la ciudad 1: Dato de entrada
   double Longitud1; // correponde a la longitud de la ciudad 1: Dato de entrada
   double Latitud2; // Corresponde a la latitud de la ciudad 2: Dato de entrada
   double Longitud2; // correponde a la longitud de la ciudad 2: Dato de entrada
   double D; // corresponde a la distancia entre las dos ciudades: Dato de salida
   
   Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese el valor de la latitud de la ciudad 1 : ");
       Latitud1 = teclado.nextDouble();
       System.out.print("Ingrese el valor de la longitud de la ciudad 1 : ");
       Longitud1 = teclado.nextDouble();
       System.out.print("Ingrese el valor de la latitud de la ciudad 2 : ");
       Latitud2 = teclado.nextDouble();
       System.out.print("Ingrese el valor de la longitud de la ciudad 2 : ");
       Longitud2 = teclado.nextDouble();
       
          
       // 2. Hallar los datos de salida
       D = 6371.07 * Math.acos(Math.sin(Latitud1)) * Math.sin(Latitud2) + Math.cos(Latitud1) * Math.cos(Latitud2) * Math.cos(Longitud1) - (Longitud2);
       
          
       
              // 3. Mostrar los datos de salida
       System.out.println("La distancia entre las dos ciudades es " + D );
    }
      
}
    

