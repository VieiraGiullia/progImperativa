package com.mycompany.pesquisa;

import java.util.Random;


public class Pesquisa {

    public static void main(String[] args) {
        final int TAM = 30;
        int[] vet = new int[TAM]; 
        vet = vetorAleatorio(vet, 50);
        vet = metodoBolha(vet);
        int procurado = 20;
        System.out.println("\nVetor gerado:");
        exibeVetor(vet);
        int r = buscaBinaria(vet, procurado); 
        if(r == -1){
            System.out.println("\nO elemento " + procurado + " não está presente no vetor");
        } else {
            System.out.println("\nO elemento " + procurado + " está presente na posição " + (r+1));
        }
        
    }

    public static int buscaSequencial(int v[], int procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < v.length; i++) {
            if (v[i] == procurado) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return i;  // retorna a posição onde encontrou a chave
        } else {
            return -1; // retorna -1 indicando que não achou a chave
        }
    }
    
    public static int buscaMelhorada(int v[], int procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < v.length; i++) {
            if (v[i] == procurado) {
                achou = true;
                break;
            } else if (v[i] > procurado) {
                break;
            }
        }
        if (achou == true) {
            return i;     // retorna a posição onde encontrou a chave
        } else {
            return -1;    // retorna -1 indicando que não achou a chave
        }               
    }
    
    
    public static int buscaBinaria(int[] v, int procurado) {
        int inicio = 0, meio = 0, fim = v.length - 1; boolean achou = false;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (v[meio] == procurado) {
                achou = true;
                break;
            } else if (v[meio] > procurado) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        if (achou == true) {
            return meio; // retorna a posição onde encontrou a chave
        } else { 
            return -1; // retorna -1 indicando que não achou a chave
        }          
    }
    
    public static int[] metodoBolha(int[] vet) {
        int i = vet.length;
        while (i >= 2) {
            for (int j = 0; j < i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
            i = i - 1;
        }
        return (vet);
    }
    
    public static int[] vetorAleatorio(int[] vet, int intervalo){
        // Declaração da variável para trabalhar com 
        // números inteiros aleatórios
        Random r;
        r = new Random();
        for(int i = 0; i < vet.length; i++){
            vet[i] = r.nextInt(intervalo) + 1;
        }
        return(vet);
    }
    
    // Método para exibir um vetor de inteiros
    public static void exibeVetor(int[] vet){
        
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    }
}
    