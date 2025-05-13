/********************************************************************
 * Programa que calcula el factorial de un numero.
 * para resolverlo con base en la capacitación se empleará un bucle
 * aunque otra posible solución es recursión
*********************************************************************/
import java.util.*;
import java.io.*;
public class Factorial {

    public static int FirstFactorial(int num)
    {
        int factorial=1;
        int i=1;
        while (i<=num)
        {
            factorial*=i;
            i++;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
