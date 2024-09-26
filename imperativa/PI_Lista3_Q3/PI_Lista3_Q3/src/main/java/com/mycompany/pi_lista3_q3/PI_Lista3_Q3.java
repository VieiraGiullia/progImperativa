

package com.mycompany.pi_lista3_q3;

import java.util.Random;


public class PI_Lista3_Q3 {

    public static void main(String[] args) {
        
        double[][] mat = new double[10][10];
        int linha1 = 2, linha2 = 8;
        
        mat = matrizAleatoria(mat,20);
        System.out.println("Matriz original:");
        exibeMatriz(mat);
        
        trocarLinhasMatriz(mat, linha1,linha2);
        System.out.println("Matriz com as linhas trocadas:");
        exibeMatriz(mat);
        
    }
    
    
    public static void exibeMatriz(double[][] mat){
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) 
               System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }
    
    public static double[][] matrizAleatoria(double[][] mat, int intervalo){
        // Declaração da variável para trabalhar com 
        // números inteiros aleatórios
        Random r;
        r = new Random();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = r.nextInt(intervalo);
            }
            
        }
        return(mat);
    }
    
    
    public static void trocarLinhasMatriz(double[][] mat, int linha1, int linha2){
        for(int j = 0; j < mat.length; j++){
            double temp = mat[linha1][j];
            mat[linha1][j] = mat[linha2][j];
            mat[linha2][j] = temp;
        }
    }
    
    
}
