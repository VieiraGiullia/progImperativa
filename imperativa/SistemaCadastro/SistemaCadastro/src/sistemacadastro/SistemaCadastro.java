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
        System.out.println("\nLista de Funcionarios");
        exibeFuncionario(f);
    }
  
    public static void exibeFuncionario(Funcionario[] f) {
        for (int i = 0; i < f.length; i++) {
            System.out.print("Nome: " + f[i].nome);
            System.out.println(" Salario: R$ " + f[i].salario);
        }
    }

}
