package md12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Queue<String> lista = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		
		
		do{
			
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("\n2 - Listar todos os Clientes");
			System.out.println("\n3 - Retirar Cliente da Fila");
			System.out.println("\n0 - sair");
			System.out.println("\n ****************************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = ler.nextInt();
			ler.nextLine();
			
			switch(op) {
			case 1:
				System.out.println("\n Nome do cliente: ");
				String nome = ler.nextLine();
			
				lista.add(nome);
					System.out.println("\nFila: ");
					System.out.println(lista);
					System.out.println("Cliente adicionado!");
					break;
			case 2:
				if(lista.isEmpty()) {
					System.out.println("\nA fila está vazia.");
				}else {
					System.out.println("\nClientes na fila: ");
					for(String nomeCliente : lista) {
						System.out.println(nomeCliente);
					}
				}
				break;
			case 3:
				if(lista.isEmpty()) {
					System.out.println("\nA fila está vazia no momento");
				}else {
					String nomeChamado = lista.poll();
					System.out.println("\n" +nomeChamado+ "foi chamado(a)");
					System.out.println("Fila atual: ");
					for(String nomeCliente: lista) {
						System.out.println(nomeCliente);
					}
				}
			break;
			case 0:
				System.out.println("\nO programa está finalizado.");
				break;
			
				default:
					System.out.println("\nOpção inválida.Por favor, digite uma opção válida.");
			}
		}while(op != 0);
	}
}
