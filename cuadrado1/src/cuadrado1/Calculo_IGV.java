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
public class Calculo_IGV {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float precio;
        float monto_pagar;
        float monto_IGV;
        System.out.println("dame el monto total:");
        precio  = input.nextFloat();
        monto_IGV = (float) (precio * 0.18);
        monto_pagar = precio - monto_IGV;
        System.out.println("el monto a Pagar es:"+monto_pagar);
        System.out.println("el monto de IGV es:"+monto_IGV);
    }
}
