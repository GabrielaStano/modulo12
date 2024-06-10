package md12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numeros = new HashSet<>();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n Digite 10 números inteiros não repetidos: ");
		while(numeros.size()<10){
			System.out.println("Valor "+(numeros.size()+1)+ " : ");
			int num = ler.nextInt();
			numeros.add(num);
			}
		
			Iterator<Integer> inumeros = numeros.iterator();
			System.out.println("\nLista dados do Set: ");
			while(inumeros.hasNext()) {
				System.out.println(inumeros.next());
			
		}
	}

}
