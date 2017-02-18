
package actividad6;
import java.util.Scanner;

public class ACTIVIDAD6 {

  
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL PROGRAMA CALCULADOR  DE FACTORIAL");
        Scanner kb = new Scanner(System.in);
        
        
        int numero;
        numero = pedirNumero();
        calcularFactorial(numero);
    }
    
    public static int pedirNumero(){
        int numero;
        System.out.println("Por favor ingresa el numero");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        
        
        if (numero < 1 || numero > 10){
            System.out.println("Lo sentimos hay un error, numero fuera de rango permitido");
            pedirNumero();
            
        } else {
            
        }
        return numero;
    }
    
    public static void calcularFactorial(int numero){
        int factorial, contador;
        contador = 1;
        factorial = 1;
       
        
        do {
            contador++;
            factorial = factorial*(contador);
            
            
        } while (contador < (numero));
        System.out.println("El factorial del numero ingresado es: " + factorial);
        
           
        
    }
    
}
