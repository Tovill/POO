//Ejemplo1 Realiza una simple suma orientado a objetos
//para empezar, en ya debemos de tener en cuenta lo fundamental de la programacion para  poder entender poo
//En este ejercicio se tiene en cuenta cosas ya usadas pero con la diferencia de que ahora debemos de tener el concepto de que es un metodo y clase
//Empezaremos con una simple suma 
public class Ejemplo1 //nombre de la clase inicial

{
    public int Suma(int num1,int num2)//metodo de suma que solo suma 2 numeros enteros, y cuyos datos son enteros 
    {
        return num1+num2;//devuelve los numeros enteros y realiza la suma
    }

    public double Suma( double num1,double num2)//metodo de suma para numeros decimales, los valores deben de ser decimales
    {
        return num1+num2;//devuelve los numeros decimales y realiza la suma
    }

    public static void main(String[] args) 
    {
        // Crear una instancia de la clase Sumador
        Ejemplo1 sumador = new Ejemplo1();
        
        // Sumar dos números enteros
        int resultadoEntero = sumador.Suma(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultadoEntero);
        
        // Sumar dos números decimales
        double resultadoDecimal = sumador.Suma(2.5, 3.7);
        System.out.println("La suma de 2.5 y 3.7 es: " + resultadoDecimal);
    }
}