package CollectionJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetBusca {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Set<Integer> nums = new HashSet<Integer>();
		int num;
		
		nums.add(2);
		nums.add(5);
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(9);
		nums.add(7);
		nums.add(8);
		nums.add(10);
		nums.add(6);
		
		System.out.print("Insira o número da busca: ");
		num = ler.nextInt();
		ler.close();
		
		if (nums.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}

	}

}
