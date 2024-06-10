package md12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList <String> cores = new ArrayList();
		Scanner ler = new Scanner ( System.in);
		
		System.out.println("\nDigite 5 cores: ");
		
		for(int i=0; i<5; i++) {
			System.out.println("Cor "+(i+1)+" : ");
			String cor = ler.next();
			cores.add(cor);
		}
			
		System.out.println("\nCores escolhidas: ");
		for(String cor : cores) {
			System.out.println("\n"+cor);
		}
		
		Collections.sort(cores);
		System.out.println("Cores ordenadas: ");
		for(String cor : cores) {
			System.out.println("\n"+cor);
		}
	}
}
