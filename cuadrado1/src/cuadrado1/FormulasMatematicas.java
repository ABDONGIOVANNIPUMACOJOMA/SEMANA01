/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrado1;

import java.util.Scanner;



/**
 *
 * @author User
 */

public class FormulasMatematicas {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            Float primerNumero, segundoNumero, resultado = null;
            String operacion;
            
            System.out.println("Digita el primer Numero");
            primerNumero = input.nextFloat(); //1
            System.out.println("Digita el segundo Numero");
            segundoNumero = input.nextFloat(); //2
            System.out.println("Ingresa la operacion a realizar (suma - resta - division - multiplicacion)"); //resta
            operacion = input.next(); //division
            
            if(operacion.equals("resta")){
                resultado = primerNumero - segundoNumero;
            } else if(operacion.equals("suma")){
                resultado = primerNumero + segundoNumero;
            } else if(operacion.equals("division")){
                resultado = primerNumero / segundoNumero;
            } else if(operacion.equals("multiplicacion")){
                resultado = primerNumero * segundoNumero;
            }
            System.out.println("El resultado es: "+ resultado);
            
            
//            float area, perimetro, lado;
//            System.out.println("ingresa uno de los lados del cuadrado");
//            lado = input.nextFloat();
//            area = lado * lado;
//            perimetro = lado * 4;
//            System.out.println("El area del cuadrado es : "+area+" cm2");
//            System.out.println("El penimetco del cuadrado es: "+perimetro+" cm");
        }
}
