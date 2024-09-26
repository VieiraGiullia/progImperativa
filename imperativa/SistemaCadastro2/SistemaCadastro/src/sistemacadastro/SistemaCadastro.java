/*
Exercícios:
1. Construir e exbir uma lista com 5 funcionários 
2. Pesquisar um funcionário pelo nome. Apresentar os dados do funcionario.
3. Ordenar pelo nome a lista de funcionários a partir do exercício 1.
*/


package sistemacadastro;

import java.util.Scanner;

public class SistemaCadastro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nf = 3; // número de funcionários

        //declaração do vetor de funcionários 
        Funcionario[] f;
        f = new Funcionario[nf];

        //laço para cadastrar os funcionários
        for (int i = 0; i < nf; i++) {
            System.out.println("Digite nome do " + (i + 1) + "o funcionario: ");
            String n = s.nextLine();
            System.out.println("Digite salario do " + (i + 1) + "o funcionario: ");
            double sal = s.nextDouble();
            f[i] = new Funcionario();
            f[i].nome = n;
            f[i].salario = sal;
            s.nextLine();
        }
        
        //exibe a lista de funcionários
        //System.out.println("\nLista de Funcionarios");
        //exibeFuncionario(f);
        
        System.out.println("Digite o nome do funcionário a ser pesquisado: ");
        String procurado = s.nextLine();
        int r = buscaSequencial(f, procurado); 
        if(r == -1){
            System.out.println("\nO funcionário " + procurado + " não está presente no cadastro.");
        } else {
            System.out.println("Os dados do(a) funcionário(a) são:");
            System.out.print("Nome: " + f[r].nome);
            System.out.println(" Salario: R$ " + f[r].salario);
        }
        
        System.out.println("Lista de funcionários ordenada por nome: ");
        f = metodoBolha(f);
        exibeFuncionario(f);
        
    }
  
    public static void exibeFuncionario(Funcionario[] f) {
        for (int i = 0; i < f.length; i++) {
            System.out.print("Nome: " + f[i].nome);
            System.out.println(" Salario: R$ " + f[i].salario);
        }
    }
    
    public static int buscaSequencial(Funcionario[] v, String procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < v.length; i++) {
            if (v[i].nome.compareTo(procurado) == 0) {
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
    
    public static Funcionario[] metodoBolha(Funcionario[] vet) {
        int i = vet.length;
        while (i >= 2) {
            for (int j = 0; j < i - 1; j++) {
                if (vet[j].nome.compareTo(vet[j + 1].nome) > 0) {
                    Funcionario temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
            i = i - 1;
        }
        return (vet);
    }

}
