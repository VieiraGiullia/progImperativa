package com.mycompany.projnumaleatorio;

import java.util.Random;

public class ProjNumAleatorio {

    public static void main(String[] args) {
        final int tMax = 10; // Tamanho do vetor
        int[] v; // Variável que irá receber o vetor aleatório
        v = new int[tMax];
        final int intervalo = 20; // Gerar números entre 0 20
        
        // Vetor inicial
        System.out.print("Vetor inicial: \n");
        exibeVetor(v);
        
        // Chamada do método para construir o vetor aleatório
        v = vetorAleatorio(v, intervalo);
        System.out.print("\nVetor aleatório de números inteiros entre 0 e 20: \n");
        exibeVetor(v);
    }
    
    public static int[] vetorAleatorio(int[] vet, int intervalo){
        // Declaração da variável para trabalhar com 
        // números inteiros aleatórios
        Random r;
        r = new Random();
        for(int i = 0; i < vet.length; i++){
            vet[i] = r.nextInt(intervalo);
        }
        return(vet);
    }


    // Método para exibir um vetor de inteiros
    public static void exibeVetor(int[] vet){
        
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    }
}
