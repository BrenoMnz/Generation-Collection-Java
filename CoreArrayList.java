package CollectionJava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CoreArrayList {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Insira a " + (i+1) + "° cor: ");
			cores.add(ler.next());
		}
		
		System.out.println("\nLista de todas as cores\n");
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		Iterator<String> iCores = cores.iterator();
		
		System.out.println("\nLista de todas as cores ordenadas\n");
		while (iCores.hasNext() == true) {
			System.out.println(iCores.next());
		}

	}

}
