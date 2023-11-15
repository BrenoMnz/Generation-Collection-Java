package CollectionJava;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetMostra {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Set<Integer> nums = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i+1) + "° número: ");
			nums.add(ler.nextInt());
		}
		
		Iterator<Integer> iNums = nums.iterator();
		
		System.out.println("\nLista de números no Set Collection");
		while (iNums.hasNext()) {
			System.out.println(iNums.next());
		}
	}

}
