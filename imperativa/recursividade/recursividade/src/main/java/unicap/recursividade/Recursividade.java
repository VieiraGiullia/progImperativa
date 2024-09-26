package unicap.recursividade;

import java.util.Scanner;

public class Recursividade {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int opcao;
        
        do {
            menu();
            //System.out.print("Digital a opção");
            opcao = dado.nextInt();
            switch(opcao){
                case 1: System.out.println("Digite um número inteiro: ");
                    int n = dado.nextInt();
                    int f = fatorialRecursivo(n);
                    System.out.println("O fatorial de " + n + " é " + f);
                    break;
                case 2:
                    System.out.println("Digite a base: ");
                    int x = dado.nextInt();
                    System.out.println("Digite o expoente: ");
                    int y = dado.nextInt();
                    int p = potencia(x, y);
                    System.out.println(x + " elevado a " + y + " é igual a " + p);
                    break;
                case 3: 
                    System.out.println("Digite o 1o número: ");
                    x = dado.nextInt();
                    System.out.println("Digite o 2o número: ");
                    y = dado.nextInt();
                    p = multiplicacao(x, y);
                    System.out.println("A multiplicação de " + x + " por " + y + " é igual a " + p);
                    break;
                case 4: 
                    int[] v = {2,5,4,5};
                    int s = somaElemetosVetorRecursivo(v, v.length);
                    System.out.println(s);
                    break;
                case 5:
                    int[] v2 = {5,13,4,2};
                    int m = maiorElemetosVetorRecursivo(v2, v2.length);
                    System.out.println(m);
                    break;
                case 6:
                    System.out.println("Quantos elementos da sequência de Fibonacci deseja calcular ?");
                    n = dado.nextInt();
                    for(int i = 1; i <= n; i++)
                        System.out.print(fibonacci(i) + " ");
                    System.out.println();
                    break;
                case 0:
                    break;
                default: System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
        
    } 
    
    
    public static int fatorialRecursivo(int n){
        if(n == 0){
            return 1;
        }
        else {
            return n * fatorialRecursivo(n-1);
        }
    }
    
    public static int fatorialIterativo(int n){
        int f = 1;
        for(int i = n; i > 0; i--){
            f = f * i;
        }
        return(f);
    }
    
    
    public static int potencia(int x, int y){
        if(y == 0){
            return(1);
        }
        else {
            return(x * potencia(x, y-1));
        }
    }
    
    public static int multiplicacao(int x, int y){
        if(y == 0){
            return(0);
        }
        else {
            return(x + multiplicacao(x, y-1));
        }
    }
    
    
    public static void menu(){
        System.out.println("1. Fatorial.");
        System.out.println("2. Potência.");
        System.out.println("3. Multiplição.");
        System.out.println("4. Soma dos elementos do vetor.");
        System.out.println("5. Maior elemento do vetor.");
        System.out.println("6. Fibonacci.");
        System.out.println("0. Sair");
        System.out.println("Digite a opção:");
    }
    
    
    public static int somaElemetosVetorRecursivo(int[] v, int tam){
        if(tam == 1) {
            return(v[0]);
        }
        else {
            return(v[tam-1] + somaElemetosVetorRecursivo(v, tam - 1));
        }
    }
    
    
    public static int maiorElemetosVetorRecursivo(int[] v, int tam){
        if(tam == 1){
            return(v[0]);
        }
        else {
            int m = maiorElemetosVetorRecursivo(v, tam - 1);
            if(m > v[tam -1]) return(m);
            else return(v[tam-1]);
        }
    }
    
    public static int fibonacci(int n){
        if(n <= 1){
            return(n);
        }
        else {
            return(fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
