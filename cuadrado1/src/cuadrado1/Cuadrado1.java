/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado1;

import java.util.Scanner;


public class Cuadrado1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        float area, perimetro, lado;
        System.out.println("ingresa uno de los lados del cuadrado");
        lado = input.nextFloat();
        area = lado * lado;
        perimetro = lado * 4;
        System.out.println("El area del cuadrado es : "+area+" cm2");
        System.out.println("El penimetco del cuadrado es: "+perimetro+" cm");
    }
    
}
