//Ejemplo1 Realiza una simple suma orientado a objetos
import java.util.Scanner;
public class Ejemplo1 
{
    //private Ejemplo1()
    //{ 
    //}

    public void HacerSuma(int a, int b, int c)
    {
       
        Scanner scan= new Scanner(System.in);
        System.out.println("Digita el primer numero a sumar ");
        a=scan.nextInt();

        System.out.println("Digita el segundo numero a sumar ");
        b=scan.nextInt();

        c=a+b;

        System.out.println("El resultado es :" + c);
        scan.close();
    }

    public static void main(String args[])
    {
        Ejemplo1 Suma = new Ejemplo1();
        int a=0,b=0,c=0;

        Suma.HacerSuma(a,b,c);
    }
}
