
package arrays1;
import java.util.Scanner;

public class ARRAYS1 {

    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al programa seleccionador de numeros telefónicos");
        
         int num;
         
         Scanner kb = new Scanner (System.in);
            String [] telefono = new String[10];
            for (int i = 0; i < telefono.length; i++){
            System.out.println("Por favor ingresa el telófono" + i);
            telefono[i] = kb.nextLine();
            
            }
            
            System.out.println("Por favor ingrese que numero que desea consultar");
            num = kb.nextInt();
            if (num< telefono.length){
            System.out.println("El numero es " + telefono[num]);
            } else System.out.println("El numero se encuentra fuera del rango establecido.");
        
            System.out.println("Gracias por participar amigo");
        
    }
    
}
