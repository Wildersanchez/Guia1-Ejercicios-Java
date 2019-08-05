import java.util.Scanner;
/**
 * Calcular area de un circulo y volumen de una esfera
 * 
 * @author WilderSanchez 
 * @version 04082019
 */
public class AreaVolumen
{
   public static void main(String[] args)
  { 
   double r; // Corresponde al valor de un radio r: Dato de entrada
   double A; // Corresponde al valor del area de un circulo con radio r: Dato de salida
   double V; // Corresponde al valor del volumen de una esfera de radio r: Dato de salida
   
   Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese el valor del radio del circulo y la esfera: ");
       r = teclado.nextDouble();
       
       
       // 2. Hallar los datos de salida
       A = (Math.PI) * Math.pow (r,2);
       V = (4/3) * (Math.PI) * Math.pow (r,3);
       
       
              // 3. Mostrar los datos de salida
       System.out.println("El área del circulo es " + A);
       System.out.println("El volumen de la esfera es " + V);
       
    }
}
