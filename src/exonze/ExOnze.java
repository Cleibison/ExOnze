/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exonze;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExOnze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //11. Faça um programa que calcule e imprima a área de um losango.
        Scanner entrada = new Scanner(System.in);
        float diagMaior;
        float diagMenor;
        float area;
        System.out.println("Digite a diagonal maior: ");
        diagMaior = entrada.nextFloat();
        System.out.println("Digite a diagonal menor: ");
        diagMenor = entrada.nextFloat();
        area = (diagMaior*diagMenor)/2;
        
        System.out.println("A area do losango é de : "+area + " "+ "cm²");
    }
    
}
