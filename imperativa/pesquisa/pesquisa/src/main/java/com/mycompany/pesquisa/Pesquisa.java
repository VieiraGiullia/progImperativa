package com.mycompany.pesquisa;


public class Pesquisa {

    public static void main(String[] args) {
        //int[] vet = {27, 19, 37, 15, 20, 17, 21, 12};
        int[] vetOrdenado = {12, 15, 17, 19, 20, 21, 27, 37}; 
        int procurado = 27;
        
        //int r = buscaSequencial(vet, procurado); 
        int r = buscaMelhorada(vetOrdenado, procurado); 
        if(r == -1){
            System.out.println("O elemento " + procurado + " não está presente no vetor");
        } else {
            System.out.println("O elemento " + procurado + " está presente na posição " + (r+1));
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
}