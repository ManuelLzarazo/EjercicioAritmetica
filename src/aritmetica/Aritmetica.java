/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        double Numero1 =0;
        double Numero2 =0;
        double Suma=0;
        double Resta=0;
        double Producto=0;
        double Cociente=0;
        double Residuo=0;
        double Logaritmo=0;
        double Elevado=0;
        
        
        System.out.println("Digite la Variable a");
        Numero1=entrada.nextDouble();
        System.out.println("Digite la variable b");
        Numero2=entrada.nextDouble();
        
        Suma =Numero1 + Numero2;
        Resta =Numero2 -Numero1;
        Producto =Numero1*Numero2;
        Cociente = Numero1/Numero2;
        Residuo= Numero1%Numero2;
        Logaritmo =(Math.log(Numero1));
        Elevado = Math.pow(Numero1,Numero2);
        
        System.out.println("La Suma es:"+Suma);
        System.out.println("La Resta es:"+Resta);
        System.out.println("El Producto es:"+Producto);
        System.out.println("El Cociente es:"+Cociente);
        System.out.println("El Residuo es:"+Residuo);
        System.out.println("El Logarigmo de a es:"+Logaritmo);
        System.out.println("a elevado a la b es:"+Elevado);
        
        // TODO code application logic here
    }
    
}
