package md12;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner (System.in);
		
		do {
			System.out.println("\n1- Adicionar livro na pilha");
			System.out.println("\n2- Listar todos os livros");
			System.out.println("\n3- Retirar livro da pilha");
			System.out.println("\n4- Sair");
			op = ler.nextInt();
			ler.nextLine();
			
			switch(op){
			case 1: 
				System.out.println("\nEscreva o nome: ");
				String nome = ler.nextLine();
				pilha.add(nome);
				System.out.println("\nPilha: ");
				System.out.println("\n"+pilha);
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("\nA lista esta vazia.");
				}else {
					System.out.println("Lista de livros na Pilha: ");
					for(String nomeLivro : pilha) {
						System.out.println(nomeLivro);
					}
				}
				break;
			case 3:
				if(pilha.isEmpty()) {
				System.out.println("A pilha de livros está vazia.");
			}else {
				pilha.pop();
				System.out.println("\nPilha: ");
				for(String nomeRetirado : pilha) {
				System.out.println(nomeRetirado);
				}
				System.out.println("Um livro foi retirado da pilha!");	
			}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida.Por favor, digite uma opção válida.");
			}
			
		}while(op !=0);
	}

}
