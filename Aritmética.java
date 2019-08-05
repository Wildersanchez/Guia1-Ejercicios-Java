import java.util.Scanner;

/**
 * Permite desarrollar ejercicios de aritmética
 * 
 * @author WilderSanchez
 * @version 04082019
 */
public class Aritmética
{
    public static void main(String[] args)
   {
       double a, b; // Corresponde a las variables enteras: Datos de entrada 
       double SUMA;     //  Corresponde a la suma: Dato de salida
       double DIFERENCIA;  //  Corresponde a restar b de a: Dato de salida
       double PRODUCTO;     //  Corresponde a la multiplicación: Dato de salida
       double DIVISIÓN;     //  Corresponde a dividir a en b: Dato de salida
       double LOGARITMO;     //  Corresponde a encontrar el logaritmo de a: Dato de salida
       double POTENCIA;     //  Corresponde a elevar a en b: Dato de salida
       
       Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese el valor de la variable a: ");
       a = teclado.nextDouble();
       
       System.out.print("Ingrese el valor de la variable b: ");
       b = teclado.nextDouble();
       
       // 2. Hallar los datos de salida
       SUMA = a + b;
       DIFERENCIA = a - b;
       PRODUCTO = a * b;
       DIVISIÓN = a / b;
       LOGARITMO = Math.log (a);
       POTENCIA = Math.pow (a,b);
       
       
              // 3. Mostrar los datos de salida
       System.out.println("La suma de las variables es " + SUMA);
       System.out.println("La diferencia de las variables es " + DIFERENCIA);
       System.out.println("El producto de las variables es " + PRODUCTO);
       System.out.println("La división de las variables es " + DIVISIÓN);
       System.out.println("El logaritmo de la variable a es " + LOGARITMO);
       System.out.println("La potencia de las variables es " + POTENCIA);
    }
}
       

