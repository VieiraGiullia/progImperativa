package com.mycompany.matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        double[][] matriz = new double[2][3];
        System.out.println("Preenchimento da matriz");
        preencher(matriz);
        System.out.println("Exibição da matriz.");
        exibir(matriz);
    }
    
    public static void preencher(double[][] mat){
        Scanner dado = new Scanner(System.in);
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
               System.out.println("Digite o elemento da matriz: "); 
               mat[i][j] = dado.nextDouble();
            }
        }   
    }
    
    public static void exibir(double[][] mat){
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) 
               System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }
}
