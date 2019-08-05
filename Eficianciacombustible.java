import java.util.Scanner;
/**
 * Realizar conversion entre MPG a LPK
 * 
 * @author WilderSanchez 
 * @version 04082019
 */
public class Eficianciacombustible
{
   public static void main(String[] args)
{
   double MPG; // Corresponde a la eficiencia del combustible en MPG: Dato de entrada
   double LPK; // correponde a la eficiencia del combustible en LPK: Dato de salida
   
   Scanner teclado = new Scanner(System.in);
       // Pasos a seguir para resolver todos los problemas
       // 1. Obtener los datos de entrada
       System.out.print("Ingrese el valor de la eficiencia del combustible de su vehiculo en MPG : ");
       MPG = teclado.nextDouble();
       
          
       // 2. Hallar los datos de salida
       LPK = 1 / ((MPG * 1.609 ) / 3.79);
          
       
              // 3. Mostrar los datos de salida
       System.out.println("La eficiencia del combustible en LPK es " + LPK);
    }
      
}
