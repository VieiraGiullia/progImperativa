package unicap.ordenacao;
import java.util.Scanner;

public class Ordenacao {

    public static void main(String[] args) {
        int[] vet = {6, 5, 4, 3, 2, 1};
        int opcao;
        Scanner dado;
        dado = new Scanner(System.in);
        
        do{
            menu();
            System.out.println("Digite uma opção:");
            opcao = dado.nextInt();
            switch (opcao) {
                case 1:
                    vet = metodoBolha(vet);
                    System.out.println("Vetor ordenado pelo método da bolha:");
                    exibeVetor(vet);
                    break;
                case 2:
                    vet = insercaoDireta(vet);
                    System.out.println("Vetor ordenado pelo método inserção direta:");
                    exibeVetor(vet);
                    break;
                case 3:
                    vet = selecaoDireta(vet);
                    System.out.println("Vetor ordenado pelo método seleção direta:");
                    exibeVetor(vet);
                    break;
                case 0:
                    System.out.println("Fim do programa!");
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Opção inválida!");                    
            }
        }while(opcao != 0);
    }
    
    
    public static int[] metodoBolha (int[] vet){
        int i = vet.length;
        while (i >= 2){
           for(int j = 0; j < i-1; j++){
               if(vet[j] > vet[j+1]){
                   int temp = vet[j];
                   vet[j] = vet[j+1];
                   vet[j+1] = temp;
               }
           }
           i = i - 1;
        }
        return(vet);
    }
    
    public static int[] insercaoDireta(int vet[ ]){
    int i,j,chave;	
    int fim = vet.length - 1;
    
        for (i = 1; i <= fim; i++){
            chave = vet[i];
            j = i - 1;
            while(j >= 0 && vet[j] > chave){
                vet[j+1] = vet[j];
                j = j - 1;
            }
            vet[j+1] = chave;
        }
        return(vet);
    }


    public static int[] selecaoDireta(int[] vet){
    int i, j, menor, aux;
    
	for (i = 0; i < vet.length - 1; i++){
	    menor = i;
	    for (j = i + 1; j <= vet.length - 1; j++){
                if (vet[j] < vet[menor]){ 
                    menor = j;  
                }
            }
            aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;
        }
        return(vet);
    }

    // Método para exibir um vetor de inteiros
    public static void exibeVetor(int[] vet){
        
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    }
    
    
    public static void menu(){
        System.out.println("\nMétodos de Ordenação de vetores:.");
        System.out.println("1. Bolha.");
        System.out.println("2. Inserção Direta.");
        System.out.println("3. Seleção Direta.");
        System.out.println("0. Sair.");
    }
} // fim do programa
