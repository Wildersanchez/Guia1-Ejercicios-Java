import java.util.Scanner;


/**
 * Permite hallar el area de una cuadrado.
 * 
 * @author WilderSanchez 
 * @version 04082019
 */
public class Areacuadrado
{
   public static void main(String[] args)
   {
       double l, m; // Corresponde a los lados del cuadrado: Datos de entrada 
       double A;     //  El area: Dato de salida
       
       Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese el valor de uno de los lados del cuadrado: ");
       l = teclado.nextDouble();
       
       System.out.print("Ingrese el valor del otro lado del cuadrado: ");
       m = teclado.nextDouble();
       
       // 2. Hallar los datos de salida
       A = l * m;
       
       // 3. Mostrar los datps de salida
       System.out.println("El area del cuadrado es " + A);
       
    }
}

