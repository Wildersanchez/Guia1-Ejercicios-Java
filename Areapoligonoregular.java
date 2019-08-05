
import java.util.Scanner;
/**
 * Calcular area de un poligono regular
 * 
 * @author WilderSanchez 
 * @version 04082019
 */
public class Areapoligonoregular
{
   public static void main(String[] args)
  { 
   double s; // Corresponde al valor de la longitud de un lado del poligono regular: Dato de entrada
   double n; // Corresponde al numero de lados del poligono regular: Dato de entrada
   double A; // Corresponde al valor del area del poligono regular: Dato de salida
   
   Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese el valor de la longitud del lado del poligono regular: ");
       s = teclado.nextDouble();
       System.out.print("Ingrese la cantidad de lados del poligono regular: ");
       n = teclado.nextDouble();
       
       // 2. Hallar los datos de salida
       A = ( n * Math.pow(s,2)) / (4 * (Math.tan((Math.PI) / n)));
   
       
       
              // 3. Mostrar los datos de salida
       System.out.println("El área del poligono regular es " + A);
   
       
    }
}
