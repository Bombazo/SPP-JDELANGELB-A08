/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelangelb.a05;
import java.util.Scanner;
/**
 *
 * @author bomba
 */
public class SPPJDELANGELBA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N1=solicitaEntero("un número entero");
        double N2=solicitaDouble ("un número decimal");
        String N3=solicitaString ("una frase");
        
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
 }
    public static int solicitaEntero(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    public static double solicitaDouble (String mensaje){
        Scanner kb = new Scanner (System.in);
        double varDouble = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varDouble = kb.nextDouble();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varDouble;
    }
    public static String solicitaString (String mensaje){
        Scanner kb = new Scanner (System.in);
        String varString = null;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varString = kb.nextLine();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varString;
    }
}
    
    

