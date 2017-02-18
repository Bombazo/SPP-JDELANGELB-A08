
package actividad6.pkg1;
import java.util.Scanner;


public class ACTIVIDAD61 {

    
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL PROGRAMA COMPA");
        Scanner kb = new Scanner(System.in);
        
        
        
         int suma=0, numero;
         numero = SolicitarDatos();
         
         
         while(numero>0){
        suma = CalcularSuma(numero,suma);
        numero=SolicitarDatos();
         }
         System.out.println("El resultado de la suma es "+suma);
         }
        public static int SolicitarDatos(){
        Scanner kb = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        try{
            numero = kb.nextInt();
        }catch(Exception ex){
            System.out.println("Este no es un numero entero");
            return 0;
        }
        return numero;
    }
    static int CalcularSuma(int numero , int suma){
        suma = suma+numero;
        return suma;
        
        
        
        
        
        
    }
    
}
